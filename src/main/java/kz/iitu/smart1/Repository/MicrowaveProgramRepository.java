package kz.iitu.smart1.Repository;

import com.example.smartmicrowave.model.MicrowaveProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MicrowaveProgramRepository extends JpaRepository<MicrowaveProgram, Long> {
    List<MicrowaveProgram> findByNameContaining(String name);
}