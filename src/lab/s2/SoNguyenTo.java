package lab.s2;

public class SoNguyenTo {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public boolean isSoNguyenTo(int x){
            if (x<=2){
                return true;
            }else{
                for (int i=2;i<=Math.sqrt(x);i++){
                    if(x%i == 0)
                        return false;
                }
            }
            return true;
    }
}
