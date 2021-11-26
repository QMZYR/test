import java.util.Scanner;

public class level3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fun=sc.next();//"10+9";
        String nu[]=fun.split("[+_*/]");
        String si[]=fun.split("[0-9]");
        Double num[] = new Double[2];
for (int x=0;x<nu.length;x++) {
    try {
        num[x] = Double.parseDouble(nu[x]);
    } catch (Exception e) {
        System.out.println("只能做两个数的运算");
    }
}
double a;
switch(si[2]){
    case"*": a= num[0]*num[1];
        System.out.println(a);
    break;
    case"-":a= num[0]-num[1];
        System.out.println(a);
        break;
    case"+":a= num[0]+num[1];
        System.out.println(a);
        break;
    case"/":try{a = num[0]/num[1];
        System.out.println(a);
    }catch(Exception m)
    {
        System.out.println("分母不能为零");
    }
        break;
}
    }
}
