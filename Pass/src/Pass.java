class Pass
{
    public static void main(String[] args)
    {
        int a = 2;
        byte b = 10;
        byte c = 15;
        
        //Though both b and c are byte type, when the additional operation applied, then the result convert to int 
        int d = b +c;
        
        Pass vp = new Pass();
        a++;
        System.out.print(a); 
        vp.addOne(a);
        System.out.print("maina = " +a);
        
        
    }
    void addOne(int a) 
    {
        System.out.print("addOnea = " + a++); 
    }  
}
