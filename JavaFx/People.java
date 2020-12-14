  public class People {
    public static void main ( String[] args ) {
      Teacher tanaka = new Teacher("田中", "元気ですか？",10);
      Teacher yamamoto = new Teacher("山本", "出席たりてますか？",8;
      Teacher yoshino = new Teacher("吉野", "ALOHA!",5);

      tanaka.hello();
      yamamoto.hello();
      yoshino.hello();
      attack(tanaka,yoshino);
      attack(yamamoto,tanaka);
    }
  }

  class Teacher {
    String msg = "";
    String name = "";
    int hp;
    Teacher( String kotoba,String name.int value ) {
      msg = kotoba;
      name = mamae;
      int value;
    }
}
    public void hello() {
      System.out.println( msg + name + "です." );
    }
  }
  public static void attack(Teacher a,Teacher b){
    int damage = 5;
    int newHP = b.hp - damage;
    if(hp == 0) {
      System.out.println(b + "は死んでしまった!!");
    }
  }
