package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Micro.gate.entity.GateExam;
@Repository
public interface Repo extends JpaRepository<GateExam, Integer>{



	

}
