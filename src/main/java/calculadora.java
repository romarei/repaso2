/*
  /**
     * @return the aa
     */
    public static int getAa() {
        return aa;
    }

    /**
     * @param aAa the aa to set
     */
    public static void setAa(int aAa) {
        aa = aAa;
    }
    private int n1;
    private int num2;
    public calculadora(int a, int b){
        n1=a;
        num2=b;
    }
 
    @Override
    public int suma(){
        int result=getN1()+getNum2()+getAa();
        return result;
    }
    private static int aa = 2;
   
    @Override
    public int resta(){
        int result=getN1()-getNum2()+getAa();
        return result;
    }
    public int multiplicar(){
        int result=getN1()*getNum2()+getAa();
        return result;
    }
    public int divide(){
        int result=getN1()/getNum2();
        return result;
    }

 }
