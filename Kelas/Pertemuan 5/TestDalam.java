class Luar{
    private String variableluar = " Variable Luar ";

    public Luar(String text){
        variableluar = text;
    }

    class Dalam{
        String variabledalam = "variable dalam";

        public void bicara(){
            System.out.println(variabledalam);
            System.out.println(variableluar);
        }
    }
}

class TestDalam{
    Luar l = new Luar();
    Luar.Dalam d = l.new Dalam();
    d.bicara();
}