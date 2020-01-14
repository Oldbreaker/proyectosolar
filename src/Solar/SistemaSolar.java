
package Solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SistemaSolar extends javax.swing.JFrame {
    public ArrayList corx = new ArrayList();
    public ArrayList cory = new ArrayList();
    int lados = 360;
    
    public SistemaSolar() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH); 
        generarEstrellas();
    }
    
    public void generarEstrellas() {
        int x = lienzo.getWidth() + 500;
        int y = lienzo.getHeight() + 500;

        for (int i = 0; i < 500; i++) {
            int aleX = (int) Math.floor(Math.random() * x);
            int aleY = (int) Math.floor(Math.random() * y);
            
            corx.add(aleX);
            cory.add(aleY);
        }
      
    }
    
    public void sol() {
        Point centro = new Point();
        
        //Label Sol
        ImageIcon imgSol = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\sol.png"); //Seleccionar la imagen desde el directorio
        Icon iconoSol = new ImageIcon(imgSol.getImage().getScaledInstance(jLabel.getWidth(), jLabel.getHeight(), Image.SCALE_DEFAULT)); //Asignar la imagen en el label
        jLabel.setIcon(iconoSol);//obtener la imagen el label
        
        centro.x = lienzo.getWidth()/2 - 40;
        centro.y = lienzo.getHeight()/2 - 17;
        
        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta sol = new Planeta(poligono, jLabel, 0);
        sol.start(); 

    }
    
    public void mercurio() {
        Point centro = new Point();
        
        //Label Mercurio
        ImageIcon imgMercurio = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\mercurio.png"); 
        Icon iconoMercurio = new ImageIcon(imgMercurio.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(iconoMercurio);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.12);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta mercurio = new Planeta(poligono, jLabel1, 40);
        mercurio.start(); 
    }
    
    public void venus() {
        Point centro = new Point();
        
        //Label Venus
        ImageIcon imgVenus = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\venus.png");
        Icon iconoVenus = new ImageIcon(imgVenus.getImage().getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
        jLabel2.setIcon(iconoVenus);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.21);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta venus = new Planeta(poligono, jLabel2, 50);
        venus.start(); 
    }
    
    public void tierra() {
        Point centro = new Point();
        
        //Label Tierra
        ImageIcon imgTierra = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\tierra.png");
        Icon iconoTierra = new ImageIcon(imgTierra.getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
        jLabel3.setIcon(iconoTierra);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.31);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta tierra = new Planeta(poligono, jLabel3, 60);
        tierra.start();
    }
    
    public void marte(){
        Point centro = new Point();
        
        //Label Marte
        ImageIcon imgMarte = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\marte.png");
        Icon iconoMarte = new ImageIcon(imgMarte.getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT));
        jLabel4.setIcon(iconoMarte);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.39);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 0; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta marte = new Planeta(poligono, jLabel4, 65);
        marte.start();
    }
    
    public void jupiter() {
        Point centro = new Point();
        
        //Label Jupiter
        ImageIcon imgJupiter = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\jupiter.png");
        Icon iconoJupiter = new ImageIcon(imgJupiter.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT));
        jLabel5.setIcon(iconoJupiter);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.52);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta jupiter = new Planeta(poligono, jLabel5, 80);
        jupiter.start();
    }
    
    public void saturno() {
        Point centro = new Point();
        
        //Label Saturno
        ImageIcon imgSaturno = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\saturno.png");
        Icon iconoSaturno = new ImageIcon(imgSaturno.getImage().getScaledInstance(jLabel6.getWidth(), jLabel6.getHeight(), Image.SCALE_DEFAULT));
        jLabel6.setIcon(iconoSaturno);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.67);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }

        Planeta saturno = new Planeta(poligono, jLabel6, 90);
        saturno.start();
    }
    
    
    public void uranio() {
        Point centro = new Point();
        
        //Label Uranio
        ImageIcon imgUranio = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\uranio.png");
        Icon iconoUranio = new ImageIcon(imgUranio.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
        jLabel7.setIcon(iconoUranio);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.83);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta uranio = new Planeta(poligono, jLabel7, 100);
        uranio.start();
    }
    
    public void neptuno() {
        Point centro = new Point();
        
        //Label Neptuno
        ImageIcon imgNeptuno = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\neptuno.png");
        Icon iconoNeptuno = new ImageIcon(imgNeptuno.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT));
        jLabel8.setIcon(iconoNeptuno);
        
        centro.x = lienzo.getWidth()/2;
        centro.y = lienzo.getHeight()/2;

        int radio = (int)(Math.min(lienzo.getWidth(), lienzo.getHeight()) * 0.94);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }

        Planeta neptuno = new Planeta(poligono, jLabel8,110);
        neptuno.start();
    }
    
    public void luna() {
        Point centro = new Point();
        
        //Label Luna
        ImageIcon imgVenus = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\luna.png");
        Icon iconoVenus = new ImageIcon(imgVenus.getImage().getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_DEFAULT));
        jLabel9.setIcon(iconoVenus);
        
        centro.x = jLabel3.getX();
        centro.y = jLabel3.getY();
        
        int radio = (int)(Math.min(jLabel3.getX(), jLabel3.getY()) * 0.1);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < lados; i++) {
            poligono.addPoint((int)(centro.x + radio * Math.cos(i * 2 * Math.PI / lados)), 
                              (int)(centro.y - radio * Math.sin(i * 2 * Math.PI / lados))); 
        }
        
        Planeta luna = new Planeta(poligono, jLabel9, 10);
        luna.start(); 
    }
    
    public void cometa() {
        Point centro = new Point();
        
        //Label Cometa
        ImageIcon imgVenus = new ImageIcon("C:\\Users\\Jose Angel\\Documents\\NetBeansProjects\\Sistema Solar\\cometa.png");
        Icon iconoVenus = new ImageIcon(imgVenus.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_DEFAULT));
        jLabel10.setIcon(iconoVenus);
        
        centro.x = 0;
        centro.y = lienzo.getHeight()/2 + 30;
        
        int radio = (int)(Math.min(jLabel10.getX(), jLabel10.getY()) * 0.1);

        Polygon poligono = new Polygon();

        poligono.addPoint(centro.x + radio, centro.y);
        poligono.addPoint((int)(centro.x + radio * Math.cos(2 * Math.PI / lados)), 
                          (int)(centro.y - radio * Math.sin(2 * Math.PI / lados)));

        for (int i = 1; i < 2000; i++) {
            poligono.addPoint((int)(centro.x + i), (int)(centro.y)); 
        }
        
        Planeta cometa = new Planeta(poligono, jLabel10, 10);
        cometa.start(); 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzoLayout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                            .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(294, 294, 294))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(316, 316, 316))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzoLayout.createSequentialGroup()
                            .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(lienzoLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(190, 190, 190))
                                .addGroup(lienzoLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(70, 70, 70)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)))
                    .addGroup(lienzoLayout.createSequentialGroup()
                        .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );

        jLabel3.getAccessibleContext().setAccessibleName("tierra");

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        sol();
        mercurio();
        venus();
        tierra();
        marte();
        jupiter();
        saturno();
        uranio();
        neptuno();
        //luna();
        cometa();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaSolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaSolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaSolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaSolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaSolar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables

    public class Planeta extends Thread{
        Polygon orbita;//declaracion de una varibale global
        JLabel planeta;//declarcion de una variable global
        int tiempo;
        int tipo;
        
        public Planeta(Polygon pol, JLabel planeta, int tiempo){ 
            this.orbita = pol; //inicialisar la variable con el parametro que recibe
            this.planeta = planeta; //inicializar la variable para el parametro que se recibe
            this.tiempo = tiempo;
        }
               
        public void movimiento(){ //metodo de movimiento de planetas   
            Graphics g = lienzo.getGraphics();
            g.drawPolygon(orbita);

            int ladosX[] = orbita.xpoints;
            int ladosY[] = orbita.ypoints;

            int i = 1;         
            while(ladosX[i] != 0){
                try {
                    planeta.setLocation(ladosX[i], ladosY[i]);
                    sleep(tiempo);
                } catch(Exception e) {}
                    i++;
            }
        }
        
        public void estrellas() {
            Graphics g = lienzo.getGraphics();
            Graphics2D g2d = (Graphics2D) g;

            int x = lienzo.getWidth();
            int y = lienzo.getHeight();

            for (int i = 0; i < 500; i++) {
                Color color = Color.WHITE;
                g2d.setColor(color);
                g2d.drawOval((int)corx.get(i), (int)cory.get(i), 2, 2);
                tipo -= 2;
            }
        }
        
        public void run(){
            while(true) {
                if(tipo == 2)
                    estrellas();
                else {
                    movimiento();
                    tipo = 2;
                }
            }
        }
    }
}