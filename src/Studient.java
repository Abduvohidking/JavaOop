public class Studient {
    String name;
    String last_name;
    String grup_num;
    String []subject;
    Studient(){}
    Studient(String name,String last_name,String grup_num,String []subject){
        this.name =name;
        this.last_name = last_name;
        this.grup_num = grup_num;
        this.subject = subject;
    }

    void printSubject(){
        for (int i=0;i<subject.length;i++){
            System.out.print(subject[i]+" ");
        }
    }
}
