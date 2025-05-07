import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public  class GestorListImp implements StudiantCRUDI {

    private final List<Studiant> studiantList;

    GestorListImp() {
        this.studiantList = new ArrayList<>();
    }

    @Override
    public void createStudiant(Studiant studiant) {

        studiantList.add(studiant);
    }

    @Override
    public Optional<Studiant> readStudiant(String id) {

        return studiantList.stream().filter(e -> e.getId().equals(id)).findAny();
    }

    @Override
    public Boolean updateStudiant(String id, Studiant newStudiant) {

        Optional<Studiant> exist = readStudiant(id);
        if (exist.isPresent()) {
            exist.get().setName(newStudiant.getName());
            exist.get().setId(newStudiant.getId());
            exist.get().setAge(newStudiant.getAge());
            exist.get().setCurrentStatus(newStudiant.getCurrentStatus());
        }
        return false;
    }

    @Override
    public Boolean deleteStudiant(String id) {

        Optional<Studiant> optionalStudiant = readStudiant(id);
        if (optionalStudiant.isPresent()) {
            //Studiant studiantFound = optionalStudiant.get();
            studiantList.remove(optionalStudiant.get());
            return true;
        }else {
            System.out.println("Studian did not found");
            return false;

        }
    }
}
