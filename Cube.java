class Cube{
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String args[]){
        Cube c = new Cube();
		int X = Integer.parseInt(args[0]);
        int result = c.cube(X);
        System.out.println("cube of 5 is "+result);
    }
}
