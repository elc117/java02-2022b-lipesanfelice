class Main {
  public static void main(String[] args) {
    MesaCadeira o = new MesaCadeira();
    
    o.setX(23);
    o.setY(45);
    o.setnome1("Cadeira");
    o.setnome2("Mesa");
    
    System.out.println("A soma do número de " + o.getnome1() + " e " + o.getnome2() + " é: " + o.soma());
  }
}