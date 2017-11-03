package c1103;

public class AstractClassTest {

    static abstract class Person{
        private String name;

        public Person(){this.name=""}
        public Person(String name){this,name = name;}
        public final String getName(){return name;}

        public abstract int getId();
    }
    static class Student extends Person{
        private int id;
        public Student(String name, int id){
            //8-. super() 자동 생성
            this.id = id;
        }

        @Override
        public int getId() {
            return 0;
        }
    }
    static public void main(String[] arg){
        Person p = new Person("hika"){

            @Override
            public int getId() {
                return 0;
            }
        };
    }
}
