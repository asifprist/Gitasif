package security;

import org.springframework.beans.factory.BeanCreationNotAllowedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserServiceimpl implements IUserService,UserDetailsService{

	@Autowired
	private UserRepository UserRepo;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	@Override
	public Integer createUser(MyUser user) {
		String userpass = user.getUserpass();
		String encodedPass = encoder.encode(userpass);
		user.setUserpass(encodedPass);
		
		return UserRepo.save(user).getUserid();
	
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
