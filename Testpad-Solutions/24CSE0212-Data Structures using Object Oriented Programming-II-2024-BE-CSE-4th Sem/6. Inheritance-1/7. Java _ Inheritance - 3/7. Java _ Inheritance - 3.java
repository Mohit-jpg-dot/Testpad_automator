// Write class C here.
class C extends B {
    public void  m1() {
        System.out.println("Code");
    }
    public void  m2() {
        System.out.println("Code");
        System.out.println("Quotient");
    }
    public String toString(){
        return ("new" + super.toString());
    }
}