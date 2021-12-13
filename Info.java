package Collection;

import java.util.Objects;

public class Info {
    
    private String name;
    private int age;

   public int getAge() {
       return age;
   }
   public String getName() {
       return name;
   }
   
   public void setAge(int age) {
       this.age = age;
   }
   
   public void setName(String name) {
       this.name = name;
   }

   public Info(String name, int age){
       this.name = name;
       this.age = age;
   }

   @Override
   public boolean equals(Object obj) {
       if(obj instanceof Info){
           Info tmp = (Info)obj;
           if(tmp.name.equals(this.name)&&tmp.age==this.age);
           return true;
       } else {
           return false;
       }
       // TODO Auto-generated method stub
   }

   @Override
   public int hashCode() {
       // TODO Auto-generated method stub
       return Objects.hash(name, age);
   }

   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return "[name:"+name+",age:"+age+"]";
   }
}
