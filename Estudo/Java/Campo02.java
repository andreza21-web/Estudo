import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Compo02 extends Frame {

private Label l1=new Label("Digite o texto:");
private TextArea caixa1 = new TextArea(5,20);

    Compo02(String titulo, int largura, int altura, int colinic, int lininic){
    super(titulo);
    setSize(largura,altura);
    setLocation(colinic,lininic);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    add(l1);
    add(caixa1);
}
    public static void main(String[] args) {
    System.out.println("Hello world");
    }
}