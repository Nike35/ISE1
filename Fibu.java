class main{  
public static void main(String args[])  
{    
 int f1=0,f2=1,fi,i,cnt=100;    
 System.out.print(f1+" "+f2);//printing 0 and 1    
    
 for(i=2;i<cnt;++i) 
 {    
  fi=f1+f2;    
  System.out.print(" "+fi);    
  f1=f2;    
  f2=fi;    
 }    
 
}}  
