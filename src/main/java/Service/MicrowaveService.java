package Service;
//задумайся
import com.example.smartmicrowave.model.MicrowaveProgram;
import com.example.smartmicrowave.repository.MicrowaveProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicrowaveService {

    @Autowired
    private MicrowaveProgramRepository repository;

    public List<MicrowaveProgram> getPrograms() {
        return repository.findAll();
    }

    public MicrowaveProgram addProgram(MicrowaveProgram program) {
        return repository.save(program);
    }
}