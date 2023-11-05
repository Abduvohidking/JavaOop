public class MyClass {
    int firthAtribute , secondAtribute;
    MyClass(int firthAtribute,int secondAtribute){
        this.firthAtribute = firthAtribute;
        this.secondAtribute = secondAtribute;
    }
    void aboutAtribute(){
        System.out.println("firthAtribute:"+this.firthAtribute+"\nsecondAtribute:"+this.secondAtribute);
    }
    int sumAtribute(){
        return firthAtribute + secondAtribute;
    }
    int maxAtribute(){
        if(firthAtribute > secondAtribute){
            return firthAtribute;
        }
        else {
            return secondAtribute;
        }
    }
}
