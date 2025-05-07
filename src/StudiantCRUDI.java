import java.util.Optional;

public interface StudiantCRUDI {

    void createStudiant(Studiant studiant);
    Optional<Studiant>readStudiant(String id);
    Boolean updateStudiant(String id, Studiant newStudiant);
    Boolean deleteStudiant(String id);

}
