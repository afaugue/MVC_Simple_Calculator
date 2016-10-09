

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class CalcController {
    
    CalcView view;
    CalcModel model;
    private ActionListener result;
    private ActionListener clear;
    private ActionListener div;
    private ActionListener mult;
    private ActionListener sub;
    private ActionListener add;
    private ActionListener zero;
    private ActionListener one;
    private ActionListener two;
    private ActionListener three;
    private ActionListener four;
    private ActionListener five;
    private ActionListener six;
    private ActionListener seven;
    private ActionListener eight;
    private ActionListener nine;
    
    public CalcController(){
        init();
    }
    
    public void init(){
         view=new CalcView();       
         setActions();   
         view.setVisible(true);
    }

    public void setActions(){
        result=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = String.format("%.2f", CalcModel.eval(view.getTxt()));
               view.setTxt(res);
            }
        };
        clear=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = "";
               view.setTxt(res);
            }
        };
        div=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("/"));
            }
        };
        mult=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("*"));
            }
        };
        sub=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("-"));
            }
        };
        add=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("+"));
            }
        };
        zero=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("0"));
            }
        };
        one=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("1"));
            }
        };
        two=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("2"));
            }
        };
        three=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("3"));
            }
        };
        four=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("4"));
            }
        };
        five=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("5"));
            }
        };
        six=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("6"));
            }
        };
        seven=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("7"));
            }
        };
        eight=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("8"));
            }
        };
        nine=new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               String res = view.getTxt();
               view.setTxt(view.getTxt().concat("9"));
            }
        };
        view.adddivListener(div);
        view.addclearListener(clear);     
        view.addresultListener(result);
        view.addmultListener(mult);
        view.addminListener(sub);
        view.addplusListener(add);
        view.addzeroListener(zero);
        view.addoneListener(one);
        view.addtwoListener(two);
        view.addthreeListener(three);
        view.addfourListener(four);
        view.addfiveListener(five);
        view.addsixListener(six);
        view.addsevenListener(seven);
        view.addeightListener(eight);
        view.addnineListener(nine);     
    }
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        CalcController app = new CalcController(); 

        // TODO code application logic here
    }
    
}
