public class Main {
    public static void main(String[] args) {

        Studiant mateo=new Studiant("mateo,","3456",13,CurrentStatusEnum.NONACTIVE);
        Studiant sergio=new Studiant("sergio,","39856",19,CurrentStatusEnum.ACTIVE);
        Studiant andres=new Studiant("andres,","67856",15,CurrentStatusEnum.PFU);
        Studiant jorge=new Studiant("jorge,","678666",21,CurrentStatusEnum.ACTIVE);


        GestorListImp studiantList = new GestorListImp(); //Lista que implementa la interface//

        studiantList.createStudiant(mateo);
        studiantList.createStudiant(sergio);


        System.out.println(studiantList.readStudiant("3456"));
        System.out.println(studiantList.readStudiant("39856"));
        System.out.println(studiantList.readStudiant("356")); //Id inexistente para probar que reaStudiant funsiona//


        studiantList.updateStudiant("39856",andres); //Se actualiza a sergio por andres en la lista//


        System.out.println(studiantList.readStudiant("3456"));
        System.out.println(studiantList.readStudiant("39856"));//Anterior id de Sergio//
        System.out.println(studiantList.readStudiant("67856"));//Nuevo id de Andres//
        studiantList.deleteStudiant("3456");//Deleteamos a Mateo//
        System.out.println(studiantList.readStudiant("3456"));

        studiantList.updateStudiant("67856",jorge);
        System.out.println(studiantList.readStudiant("3456"));
        System.out.println(studiantList.readStudiant("678666"));

        System.out.println("1");
        System.out.println("2");




    }
}