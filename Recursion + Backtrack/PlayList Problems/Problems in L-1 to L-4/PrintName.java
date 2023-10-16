public class PrintName{

public static void PrintN(int i , int n){
    if(i>n)
    return;

    System.out.println("Param");
    PrintN(i+1,n);
}

public static void main (String[] args){
int n = 5;
PrintN(1,n);
}
}