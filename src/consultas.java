import ejecutar.hacer;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class consultas extends javax.swing.JInternalFrame {
   int contador,opcion,opy,opz;
    //**************************
   Font fuente = new Font("Dialog", Font.PLAIN, 10);
	PrintJob pj;	
        Graphics pagina;
        Graphics paginas;
   String cadena = "OLA";
   
   hacer mos=new hacer();
  int indice=0;
    int cuento=0,id=0;
ResultSet r=null;
 public consultas() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        IMPRI = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        congregacion = new javax.swing.JTextField();
        ciudad = new javax.swing.JTextField();
        provincia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 0));
        setClosable(true);
        setForeground(new java.awt.Color(255, 204, 0));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CONSULTA");
        setDoubleBuffered(true);
        setFrameIcon(null);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel1.setText("MES PARA IMPRIMIR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 57, 152, 21);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel2.setText("MES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(183, 27, 31, 21);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel3.setText("AÑO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(276, 27, 32, 21);

        mes.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        mes.setText("1");
        getContentPane().add(mes);
        mes.setBounds(183, 54, 93, 27);

        año.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        año.setText("12");
        getContentPane().add(año);
        año.setBounds(282, 54, 87, 27);

        IMPRI.setBackground(new java.awt.Color(255, 255, 255));
        IMPRI.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        IMPRI.setForeground(new java.awt.Color(0, 102, 0));
        IMPRI.setText("IMPRIMIR");
        IMPRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIActionPerformed(evt);
            }
        });
        getContentPane().add(IMPRI);
        IMPRI.setBounds(30, 230, 130, 26);

        Eliminar.setBackground(new java.awt.Color(204, 204, 255));
        Eliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(0, 102, 0));
        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar);
        Eliminar.setBounds(270, 230, 150, 27);

        congregacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        congregacion.setText("San Juán");
        getContentPane().add(congregacion);
        congregacion.setBounds(170, 110, 200, 27);

        ciudad.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ciudad.setText("San Juán");
        getContentPane().add(ciudad);
        ciudad.setBounds(170, 140, 200, 27);

        provincia.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        provincia.setText("Cerro De Pasco");
        getContentPane().add(provincia);
        provincia.setBounds(170, 170, 200, 27);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("CONGREGACIÓN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 120, 21);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("CIUDAD");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 150, 80, 21);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("PROVINCIA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 180, 90, 21);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IMPRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIActionPerformed
       //*********************************letras impresas*******************************************************
                     String mesi=this.mes.getText();
                     String añ=this.año.getText();
                     int ames=Integer.parseInt(mesi),bañ=Integer.parseInt(añ);
                     String sem="",oña="";
                     
                     ames=((ames==1)?12:ames-1);
                     bañ=((ames==12)? bañ-1:bañ);  
                     double gua=0,gua2=0,tutu=0;
                     //________________________________________________________________________________________________*/
                     /*_________llena datos de la tabla totalll a un array _______________________________________________________________________________________*/
                     //_________________________________________________________________________________________________
                     Escaparate3 almacen3 = new Escaparate3();
                         try{
                             r=null;
                             r=mos.listar("select*from totalll where id_tot>0 order by id_tot");
                           
                            while(r.next()){
                                almacen3.addArticulo3(r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5));                                
                              }            
                                
                        } catch(Exception error){
                        System.out.println("Clase no encontrada");
                        }
                        almacen3.sort(); 
//                      °°°°°°°°°°°°°°°°°°°BUSCA EL DATO DE LA FECHA ANTERIOR °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
                           double antes_tot=0,antes_tot2=0;int indiche=0,avisalon=0;
//                      °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°     
                            for (int i = 0; i < almacen3.getSize(); i++) {
                                Articulo3 mostrar3 = ( Articulo3) almacen3.getArticulo3(i);
                                if (mostrar3.getf()==ames && mostrar3.gete()==bañ) {
                                    antes_tot=mostrar3.getc();
                                    antes_tot2=mostrar3.getc2();
                                    avisalon=1;
                                }
                                indiche=mostrar3.getid_e();
                            }    
                                  if(avisalon==0){
                                      String intt,intt2;
                                      antes_tot=Double.parseDouble(intt=JOptionPane.showInputDialog("no existe saldodel mes"+ames+" / "+bañ+"ingrese saldo anterior de RECIBIDO"));
                                      antes_tot2=Double.parseDouble(intt2=JOptionPane.showInputDialog("no existe saldo del mes"+ames+" / "+bañ+"ingrese saldo anterior de CUENTA CORRIENTE"));
                                      
                                        try{      
                                            r=null;
                                            indiche++;
                                            String con="insert into totalll values("+indiche+","+ames+","+bañ+","+intt2+","+intt2+")";
                                            mos.intro(con);
                                            if(mos.soplon()==1)
                                            JOptionPane.showMessageDialog(this,"regiatrado correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
           
                                        }catch(Exception e){
                                        System.out.println(""+e);
                                       }
                                        JOptionPane.showMessageDialog(this," POR FAVOR INTENTAR IMPRIMIR DE NUEVO POR CAUSA DE ACTUALIZACIÓN DEL SISTEMA","atencion",JOptionPane.INFORMATION_MESSAGE);
                                   }
                                          
                                  else{
                                  
                     /*_______________________________________________________________________________________________*/
                     /*_______________________________________________________________________________________________*/
                     
                     int tam=138,s=0;
                     Escaparate almacen = new Escaparate();
                           try{
                                r=null;
                                r=mos.listar("select*from ingreso where e="+mesi+" and c="+añ +"order by id_in");
                                
                            while(r.next()){
                                almacen.addArticulo(r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6),r.getString(7),r.getString(8),r.getString(9));
                            }            
                                                                     
                        } catch(Exception error){
                        System.out.println("Clase no encontrada");
                        }
                           almacen.sort();
     //"!VV>>>Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°ÂÂÂÂ°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°                    
                         
                            Escaparate2 almacen2 = new Escaparate2();                     
                            try{
                                r=null;
                                r=mos.listar("select*from egreso where e="+mesi+" and c="+añ +"order by id_e");
                                while(r.next()){             
                                    almacen2.addArticulo2(r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6),r.getString(7),r.getString(8));                  
                                }            
                                            
                            }catch(Exception error){
                                System.out.println("Clase no encontrada");
                            }                       
                                                 
                           almacen2.sort();
       
                                       
//*******************************************************************************************************************************
                        pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "SCAT", null);
                        try
                        {
			pagina = pj.getGraphics();
                        pagina.setColor(Color.red);
			pagina.setFont(fuente);
			pagina.setColor(Color.red);
			///////////////////////
   ///***********************************************************
                        switch(Integer.parseInt(mesi)){
                            
                            case 1:pagina.drawString("Enero", 450, 90); break;
                            case 2:pagina.drawString("Febrero", 450, 90); ; break;
                            case 3:pagina.drawString("Marzo", 450, 90); ; break;
                            case 4:pagina.drawString("Abril", 450, 90); ; break;
                            case 5:pagina.drawString("Mayo", 450, 90); ; break;
                            case 6:pagina.drawString("Junio", 450, 90); ; break;
                            case 7:pagina.drawString("Julio", 450, 90); ; break;
                            case 8:pagina.drawString("Agosto", 450, 90); ; break;
                            case 9:pagina.drawString("Septiembre", 450, 90); ; break;
                            case 10:pagina.drawString("Octubre", 450, 90); ; break;
                            case 11:pagina.drawString("Noviembre", 450, 90); ; break;
                            case 12:
                                 pagina.drawString("Diciembre", 450, 90);
                                ; break;
                        }
                        pagina.drawString(añ, 529, 90) ;/*es el año*/
                        pagina.drawString(this.congregacion.getText(), 75, 90);
                        pagina.drawString(this.ciudad.getText(), 215, 90);
                        pagina.drawString(this.provincia.getText(), 342, 90);
//*********************************************************************                        
                         /////////////////////
                        Font normalFont = new Font ("serif", Font.PLAIN, 8);
                        Font boldFont = new Font ("serif", Font.BOLD, 8);
                        pagina.setFont (normalFont);
//                        pagina.drawString ("Esta es una",50,50);
                        pagina.setFont (boldFont);
//                        pagina.drawString ("Negrita",40,40);
                        pagina.setFont (normalFont);
//                        pagina.drawString ("letra", 72, 72);
                        
                        pagina.drawLine(15, 92, 180, 92);
                        pagina.drawString("(Congregacion o circuito)", 61, 100);
                        
                        pagina.drawLine(195, 92, 319, 92);   
                        pagina.drawString("(Ciudad)", 240, 100);
                        pagina.drawLine(335, 92, 417, 92); 
                        
                        pagina.drawString("(Provincia o estado)", 345, 100);
                        pagina.drawLine(434, 92, 510, 92); 
                        pagina.drawString("(Mes)", 465, 100);
                        pagina.drawLine(525,92, 580, 92);             
                        pagina.drawString("(Año)", 538, 100);
                        ////////////////////
                        pagina.setFont (boldFont);
                        pagina.drawString("HOJA DE CUENTAS", 250, 50);
                           
                        Font n = new Font ("serif", Font.PLAIN, 6);
                        Font b= new Font ("serif", Font.BOLD, 6);
                        pagina.setFont (b);
                        pagina.drawString("FECHA", 32, 140);
                        pagina.drawString("DESCRIPCION DE TRANSACCION", 84, 140);
                        pagina.drawString("CT",256, 140);
                        pagina.drawString("RECIBIDO", 300, 128);
                        pagina.drawString("CUENTA CORRIENTE", 385, 128);
                        pagina.drawString("OTRO:", 468, 128);
                        pagina.drawLine(490,128,559,128);
                        
                        
                        pagina.drawString("ENTRADA",275, 140);
                        pagina.drawString("SALIDA",330, 140);
                        pagina.drawString("ENTRADA",372, 140);
                        pagina.drawString("SALIDA",428, 140);
                        pagina.drawString("ENTRADA",470, 140);
                        pagina.drawString("SALIDA",525, 140);
                        
                        pagina.drawString("TOTALES DE TODAS LAS COLUMNAS",60, 745);
                        pagina.setFont (n);
                        ///////////////////////////////////7
                        pagina.draw3DRect(29, 117, 536, 637, true); 
                        ////////////////////////i
                        
                        pagina.drawLine(30,142,565,142);
                        pagina.drawLine(30,733,565,733);
                        //verticales
                        pagina.drawLine(53,118,53,733);
                        pagina.drawLine(253,118,253,733);
                        pagina.drawLine(268,118,268,754);/////////////////
                        
                        
                        float dif=(565-268)/6,pos=268;
                        for(int i=1;i<=6;i++){
                            pos=pos+dif;
                            if(i!=6){
                                if(i%2==0)
                                    pagina.drawLine(Math.round(pos), 118, Math.round(pos), 754);
                                else
                                     pagina.drawLine(Math.round(pos), 131, Math.round(pos), 754);
                            }
                           
                            pagina.drawLine(Math.round(pos)-12, 142, Math.round(pos)-12, 754);
                        }
                        
                        
                        //horisontal corto
                        pagina.drawLine(268,131,565,131);
                        //horizontales multiples
                        float m=(733-142)/53,com=m+142;
                        for(int i=1;i<=53;i++){
                           pagina.drawLine(30,Math.round(com),565,Math.round(com)); 
                           com=com+m;
                           System.out.println(""+m);
                        }
           
                         
                            //****************************************************************************
                        contador=0;
//***************************************************************************************************************************  
                       double sm=0,sm2=0,sm3=0,sm4=0;
                       double ss=0,ss2=0,ss3=0,ss4=0;
                       tam=138;
                       int tami=110+11;
                       for (int z=1;z<32 ;z++){
                       for (int y=0;y<almacen.getSize();y++){
                            Articulo mos= ( Articulo) almacen.getArticulo(y);
                            if (mos.getf()==z){                            
                            if(mos.getcom()!=0 && contador<54){
                                tam=tam+11;    contador++;
                                pagina.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tam);
                                pagina.drawString("C-O-M",80,tam);
                                pagina.drawString(""+Math.round(mos.getcom()-(mos.getcom()%1)),((Math.round(mos.getcom())<10)? 300:((Math.round(mos.getcom())<100)? 298:((Math.round(mos.getcom())<1000)? 294:292))),tam);
                                pagina.drawString(""+(((mos.getcom()%1)!=0)? ""+Math.round((mos.getcom()%1)*10)+"0":"00"),307,tam);
                                sm=sm+mos.getcom();
                                if (contador==54){
                                      pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                     pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);
                                     
                                     pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                     pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);
                            
                                     pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                     pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);
                            
                                     pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                     pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                                    //********************************************************
                                    pagina.dispose();paginas = pj.getGraphics();}
                                else{
                                    ss=sm;                                
                                }
                            }
                            else{
                                if(mos.getcom()!=0 && contador>=54){
                                       tami=tami+11;contador++;
                                       paginas.setFont (n);
                                       paginas.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tami);
                                       paginas.drawString("C-O-M",80,tami);
                                       paginas.drawString(""+Math.round(mos.getcom()-(mos.getcom()%1)),((Math.round(mos.getcom())<10)? 300:((Math.round(mos.getcom())<100)? 296:((Math.round(mos.getcom())<1000)? 294:292))),tami);
                                       paginas.drawString(""+(((mos.getcom()%1)!=0)? ""+Math.round((mos.getcom()%1)*10)+"0":"00"),306,tami);
                                sm=sm+mos.getcom();
                                }                         
                            }
                                
                            if(mos.getcfsr()!=0 && contador<54 ){
                                tam=tam+11;    contador++;
                                pagina.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tam);
                                pagina.drawString("C-F-S-R",80,tam);
                                pagina.drawString(""+Math.round(mos.getcfsr()-(mos.getcfsr()%1)),((Math.round(mos.getcfsr())<10)? 300:((Math.round(mos.getcfsr())<100)? 298:((Math.round(mos.getcfsr())<1000)? 294:292))),tam);
                                pagina.drawString(""+(((mos.getcfsr()%1)!=0)? ""+Math.round((mos.getcfsr()%1)*10)+"0":"00"),307,tam);
                                sm=sm+mos.getcfsr();
                                if (contador==54){
                                      pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                     pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);
                                     
                                     pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                     pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);
                            
                                     pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                     pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);
                            
                                     pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                     pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                                    //**************************************************************************
                                    pagina.dispose();paginas = pj.getGraphics();}
                                else{ss=sm;}
                            }
                            else{
                                 if(mos.getcfsr()!=0 && contador>=54 ){
                                        tami=tami+11;contador++;
                                paginas.setFont (n);
                                paginas.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tami);
                                paginas.drawString("C-F-S-R",80,tami);
                                paginas.drawString(""+Math.round(mos.getcfsr()-(mos.getcfsr()%1)),((Math.round(mos.getcfsr())<10)? 300:((Math.round(mos.getcfsr())<100)? 296:((Math.round(mos.getcfsr())<1000)? 294:292))),tami);
                                paginas.drawString(""+(((mos.getcfsr()%1)!=0)? ""+Math.round((mos.getcfsr()%1)*10)+"0":"00"),306,tami);
                                sm=sm+mos.getcfsr();                                
                                 }
                            }
                            
                            if(mos.getccc()!=0 && contador<54){
                                tam=tam+11;    contador++; 
                                pagina.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tam);
                                pagina.drawString("C-C-C",80,tam);
                                pagina.drawString(""+Math.round(mos.getccc()-(mos.getccc()%1)),((Math.round(mos.getccc())<10)? 300:((Math.round(mos.getccc())<100)? 298:((Math.round(mos.getccc())<1000)? 294:292))),tam);
                                pagina.drawString(""+(((mos.getccc()%1)!=0)? ""+Math.round((mos.getccc()%1)*10)+"0":"00"),307,tam);
                                sm=sm+mos.getccc();
                                if (contador==54){
                                      pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                     pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);
                                     
                                     pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                     pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);
                            
                                     pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                     pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);
                            
                                     pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                     pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                                    //**************************************************************
                                    pagina.dispose();paginas = pj.getGraphics();}
                                else{ss=sm;}
                            }  
                            else{
                                if(mos.getccc()!=0 && contador<54){
                                  tami=tami+11;contador++;
                                paginas.setFont (n);
                                paginas.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tami);
                                paginas.drawString("C-C-C",80,tami);
                                paginas.drawString(""+Math.round(mos.getccc()-(mos.getccc()%1)),((Math.round(mos.getccc())<10)? 300:((Math.round(mos.getccc())<100)? 296:((Math.round(mos.getccc())<1000)? 294:292))),tami);
                                paginas.drawString(""+(((mos.getccc()%1)!=0)? ""+Math.round((mos.getccc()%1)*10)+"0":"00"),306,tami);
                                sm=sm+mos.getccc();
                                }
                            }
                            
                            
                            
                                  if(!"".equals(mos.getnom_ott()) && mos.getott()!=0 && contador<54){
                                    tam=tam+11;    contador++;    opy=((contador==54)?y:0);  opz=((contador==54)?z:0);                          
                                    pagina.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tam);
                                    pagina.drawString(""+mos.getnom_ott(),80,tam);
                                    pagina.drawString(""+Math.round(mos.getott()-(mos.getott()%1)),((Math.round(mos.getott())<10)? 300:((Math.round(mos.getott())<100)? 298:((Math.round(mos.getott())<1000)? 294:292))),tam);
                                    pagina.drawString(""+(((mos.getott()%1)!=0)? ""+Math.round((mos.getott()%1)*10)+"0":"00"),307,tam);
                                    sm=sm+mos.getott();
                                        if (contador==54){
                                             pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                             pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);

                                             pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                             pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);

                                             pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                             pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);

                                             pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                             pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                                            //*****************************************************************
                                            pagina.dispose();paginas = pj.getGraphics();}
                                        else{ss=sm;}
                                    }else{
                                      if(!"".equals(mos.getnom_ott()) && mos.getott()!=0 && contador>=54){
                                    tami=tami+11;contador++;
                                    paginas.setFont (n);
                                    paginas.drawString(""+((mos.getf()>9)? ""+mos.getf():"0"+mos.getf())+"/"+((mos.gete()>9)? ""+mos.gete():"0"+mos.gete()), 34, tami);
                                    paginas.drawString(""+mos.getnom_ott(),80,tami);
                                    paginas.drawString(""+Math.round(mos.getott()-(mos.getott()%1)),((Math.round(mos.getott())<10)? 300:((Math.round(mos.getott())<100)? 296:((Math.round(mos.getott())<1000)? 294:292))),tami);
                                    paginas.drawString(""+(((mos.getott()%1)!=0)? ""+Math.round((mos.getott()%1)*10)+"0":"00"),306,tami);
                                    sm=sm+mos.getott();
                                    }
                                } 
                            
                            }
                            
                        }
//==============================================================================================================
                        //Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°Â°
                        for (int y=0;y<almacen2.getSize();y++){
                            Articulo2 moss= ( Articulo2) almacen2.getArticulo2(y);
                            if (moss.getf()==z){
                            
                                if(!"".equals(moss.getnombre()) && moss.getot()!=0 && contador<54){
                                          
                                tam=tam+11;    contador++; opy=((contador==54)?y:0);  opz=((contador==54)?z:0);                              
                                pagina.drawString(""+((moss.getf()>9)? ""+moss.getf():"0"+moss.getf())+"/"+((moss.gete()>9)? ""+moss.gete():"0"+moss.gete()), 34, tam);
                                pagina.drawString(""+moss.getnombre(),80,tam);
                                pagina.drawString(""+Math.round(moss.getot()-(moss.getot()%1)),((Math.round(moss.getot())<10)? 349:((Math.round(moss.getot())<100)? 347:((Math.round(moss.getot())<1000)? 345:341))),tam);
                                pagina.drawString(""+(((moss.getot()%1)!=0)? ""+Math.round((moss.getot()%1)*10)+"0":"00"),356,tam);
                                sm2=sm2+moss.getot();
                                    if (contador==54){
                                             pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                         pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);

                                         pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                         pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);

                                         pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                         pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);

                                         pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                         pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                                        //*********************************************************
                                        pagina.dispose();
                                    paginas = pj.getGraphics();}
                                    else{ss2=sm2;}
                                }else{
                                     if(!"".equals(moss.getnombre()) && moss.getot()!=0 && contador>=54){
                                      tami=tami+11;contador++;
                                    paginas.setFont (n);
                                    paginas.drawString(""+((moss.getf()>9)? ""+moss.getf():"0"+moss.getf())+"/"+((moss.gete()>9)? ""+moss.gete():"0"+moss.gete()), 34, tami);
                                    paginas.drawString(""+moss.getnombre(),80,tami);
                                    paginas.drawString(""+Math.round(moss.getot()-(moss.getot()%1)),((Math.round(moss.getot())<10)? 349:((Math.round(moss.getot())<100)? 347:((Math.round(moss.getot())<1000)? 345:341))),tami);
                                    paginas.drawString(""+(((moss.getot()%1)!=0)? ""+Math.round((moss.getot()%1)*10)+"0":"00"),356,tami);
                                    sm2=sm2+moss.getot();
                                     }
                                }  
                                                                
                            if(moss.getde()!=0 && contador<54){
                                tam=tam+11;    contador++;   opy=((contador==54)?y:0);  opz=((contador==54)?z:0);                           
                                pagina.drawString(""+((moss.getf()>9)? ""+moss.getf():"0"+moss.getf())+"/"+((moss.gete()>9)? ""+moss.gete():"0"+moss.gete()), 34, tam);
                                pagina.drawString("DEPOSITO",80,tam);
                                pagina.drawString(""+Math.round(moss.getde()-(moss.getde()%1)),((Math.round(moss.getde())<10)? 399:((Math.round(moss.getde())<100)? 396:((Math.round(moss.getde())<1000)? 394:392))),tam);
                                pagina.drawString(""+(((moss.getde()%1)!=0)? ""+Math.round((moss.getde()%1)*10)+"0":"00"),405,tam);
                                sm3=sm3+moss.getde();
                                    if (contador==54){
                                         pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                     pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);
                                     
                                     pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                     pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);
                            
                                     pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                     pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);
                            
                                     pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                     pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                                        //********************************************
                                        pagina.dispose();paginas = pj.getGraphics();}
                                    else{ss3=sm3;}
                                }
                            else{   
                                if(moss.getde()!=0 && contador>=54){
                                tami=tami+11;contador++;
                                paginas.setFont (n);
                                paginas.drawString(""+((moss.getf()>9)? ""+moss.getf():"0"+moss.getf())+"/"+((moss.gete()>9)? ""+moss.gete():"0"+moss.gete()), 34, tami);
                                paginas.drawString("DEPOSITO",80,tami);
                                paginas.drawString(""+Math.round(moss.getde()-(moss.getde()%1)),((Math.round(moss.getde())<10)? 398:((Math.round(moss.getde())<100)? 396:((Math.round(moss.getde())<1000)? 394:392))),tami);
                                paginas.drawString(""+(((moss.getde()%1)!=0)? ""+Math.round((moss.getde()%1)*10)+"0":"00"),406,tami);
                                sm3=sm3+moss.getde();
                                }
                                }
                            
                            if(moss.getre()!=0 && contador<54){
                                tam=tam+11;    contador++;opy=((contador==54)?y:0);  opz=((contador==54)?z:0);                              
                                pagina.drawString(""+((moss.getf()>9)? ""+moss.getf():"0"+moss.getf())+"/"+((moss.gete()>9)? ""+moss.gete():"0"+moss.gete()), 34, tam);
                                pagina.drawString("RETIRO",80,tam);
                                pagina.drawString(""+Math.round(moss.getre()-(moss.getre()%1)),((Math.round(moss.getre())<10)? 447:((Math.round(moss.getre())<100)? 445:((Math.round(moss.getre())<1000)? 442:438))),tam);
                                pagina.drawString(""+(((moss.getre()%1)!=0)? ""+Math.round((moss.getre()%1)*10)+"0":"00"),453,tam);
                                sm4=sm4+moss.getre();
                                    if (contador==54){
                                          pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                     pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);
                                     
                                     pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                     pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);
                            
                                     pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                     pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);
                            
                                     pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                     pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                                        //**********************************************
                                        pagina.dispose();paginas = pj.getGraphics();}
                                    else{ss4=sm4;}
                                }
                            else{
                               if(moss.getre()!=0 && contador>=54){
                                 tami=tami+11;contador++;
                                paginas.setFont (n);
                                paginas.drawString(""+((moss.getf()>9)? ""+moss.getf():"0"+moss.getf())+"/"+((moss.gete()>9)? ""+moss.gete():"0"+moss.gete()), 34, tami);
                                paginas.drawString("RETIRO",80,tami);
                                paginas.drawString(""+Math.round(moss.getre()-(moss.getre()%1)),((Math.round(moss.getre())<10)? 449:((Math.round(moss.getre())<100)? 447:((Math.round(moss.getre())<1000)? 445:443))),tami);
                                paginas.drawString(""+(((moss.getre()%1)!=0)? ""+Math.round((moss.getre()%1)*10)+"0":"00"),456,tami);
                                sm4=sm4+moss.getre();
                               }                     
                            }
                          }                            
                        }            
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                       }
       
                      
//********************************************************************************************************                        
                        /*
                        * ESTO ES LE TOTAL DE LA PRIMERA HOJA
                        * DE ACUERDO ALL RIGHT_--------------
                        */   
                                
                        
                        
			
                       
//<<<>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<< SEGUNDA PAGINA <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
                        if(contador <54){
                                     pagina.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 300:((Math.round(ss)<100)? 298:((Math.round(ss)<1000)? 294:292))),745);
                                     pagina.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),307,745);
                                     
                                     pagina.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),745);
                                     pagina.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,745);
                            
                                     pagina.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),745);
                                     pagina.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,745);
                            
                                     pagina.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 447:((Math.round(ss4)<100)? 445:((Math.round(ss4)<1000)? 442:438))),745);
                                     pagina.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),453,745);
                            
                            //************************************************************************************
                            pagina.dispose();paginas = pj.getGraphics();
                          
                        }
			paginas.setFont(fuente);
			paginas.setColor(Color.BLACK);
                        paginas.setFont (boldFont);
                        
                        Font norr = new Font ("serif", Font.BOLD, 6);
                        paginas.setFont(norr);
                          //************************************************************************************
                                     paginas.drawString(""+Math.round(ss-(ss%1)),((Math.round(ss)<10)? 298:((Math.round(ss)<100)? 296:((Math.round(ss)<1000)? 292:290))),121);
                                     paginas.drawString(""+(((ss%1)!=0)? ""+Math.round((ss%1)*10)+"0":"00"),306,121);
                                     
                                     paginas.drawString(""+Math.round(ss2-(ss2%1)),((Math.round(ss2)<10)? 349:((Math.round(ss2)<100)? 347:((Math.round(ss2)<1000)? 345:341))),121);
                                     paginas.drawString(""+(((ss2%1)!=0)? ""+Math.round((ss2%1)*10)+"0":"00"),356,121);
                            
                                     paginas.drawString(""+Math.round(ss3-(ss3%1)),((Math.round((ss3))<10)? 399:((Math.round(ss3)<100)? 396:((Math.round(ss3)<1000)? 394:392))),121);
                                     paginas.drawString(""+(((ss3%1)!=0)? ""+Math.round((ss3%1)*10)+"0":"00"),405,121);
                            
                                     paginas.drawString(""+Math.round(ss4-(ss4%1)),((Math.round(ss4)<10)? 449:((Math.round(ss4)<100)? 447:((Math.round(ss4)<1000)? 445:440))),121);
                                     paginas.drawString(""+(((ss4%1)!=0)? ""+Math.round((ss4%1)*10)+"0":"00"),455,121);
                            //************************************************************************************
                                     paginas.drawString(""+Math.round(sm-(sm%1)),((Math.round(sm)<10)? 298:((Math.round(sm)<100)? 296:((Math.round(sm)<1000)? 292:290))),380);
                                     paginas.drawString(""+(((sm%1)!=0)? ""+Math.round((sm%1)*10)+"0":"00"),306,380);
                                     
                                     paginas.drawString(""+Math.round(sm2-(sm2%1)),((Math.round(sm2)<10)? 349:((Math.round(sm2)<100)? 347:((Math.round(sm2)<1000)? 345:341))),380);
                                     paginas.drawString(""+(((sm2%1)!=0)? ""+Math.round((sm2%1)*10)+"0":"00"),356,380);
                            
                                     paginas.drawString(""+Math.round(sm3-(sm3%1)),((Math.round((sm3))<10)? 399:((Math.round(sm3)<100)? 396:((Math.round(sm3)<1000)? 394:392))),380);
                                     paginas.drawString(""+(((sm3%1)!=0)? ""+Math.round((sm3%1)*10)+"0":"00"),405,380);
                            
                                     paginas.drawString(""+Math.round(sm4-(sm4%1)),((Math.round(sm4)<10)? 449:((Math.round(sm4)<100)? 447:((Math.round(sm4)<1000)? 445:440))),380);
                                     paginas.drawString(""+(((sm4%1)!=0)? ""+Math.round((sm4%1)*10)+"0":"00"),455,380);
                            //************************************************************************************
                        
                        Font nor = new Font ("serif", Font.PLAIN, 6);
                        Font neg= new Font ("serif", Font.BOLD, 6);
                        Font UU= new Font ("serif", Font.BOLD, 8);
                        paginas.setFont(UU);
			paginas.drawString("HOJA DE CUENTAS", 250, 68);
                        Font fuu = new Font("serif", Font.PLAIN, 15);
                        
			paginas.drawString("Página 2", 529, 68);
                        paginas.setFont (neg);
                        paginas.draw3DRect(29, 90, 536, 300, true);
                        paginas.drawString("FECHA", 32, 110);
                        paginas.drawString("DESCRIPCION DE TRANSACCIÓN", 85, 110);
                        paginas.drawString("CT", 255, 110);
                        paginas.drawString("RECIBIDO", 300, 100);
                        paginas.drawString("CUENTA CORRIENTE", 388, 100);
                        paginas.drawString("OTRO:", 475, 100);
                        paginas.drawLine(497, 100, 559, 100);
                        
                        paginas.drawString("ENTRADA", 275, 110);
                        paginas.drawString("SALIDA", 331, 110);
                        paginas.drawString("ENTRADA", 375, 110);
                        paginas.drawString("SALIDA", 432, 110);
                        paginas.drawString("ENTRADA", 475, 110);
                        paginas.drawString("SALIDA", 530, 110);
                        
                        //lineas 
                        int salto=113;
                        for(int li=1;li<=24;li++){
                            paginas.drawLine(30, salto, 565, salto);
                            salto=salto+11;
                        }
                        paginas.drawString("Saldos anteriores",60, 121);
                        paginas.drawString("TOTALES DE TODAS LAS COLUMNAS",60, 380);
                        //linesa horizontales
                        paginas.drawLine(54, 91, 54, 365);
                        paginas.drawLine(252, 91, 252, 365);
                        paginas.drawLine(268, 91, 268, 390);
                       //linea vertical
                        paginas.drawLine(268, 102, 565, 102);
                        int saltarin=50;
                        for(int jj=1;jj<=6;jj++){
                        if (jj%2==0)
                        {paginas.drawLine(268+saltarin , 91, 268+saltarin, 390);}
                        else{
                        paginas.drawLine(268+saltarin , 102, 268+saltarin, 390);}
                        paginas.drawLine(268+saltarin-14 , 113, 268+saltarin-14, 390);
                        saltarin=saltarin+50;}
//************************************RECTANGULOS***************************************************************
                        //paginas.draw3DRect(s, s, id, id, isClosed);
                        paginas.draw3DRect(29, 400, 264, 363, true);
                        Font norm = new Font ("serif", Font.PLAIN, 9);
                        Font noo = new Font ("serif", Font.PLAIN, 7);
                        Font negr= new Font ("serif", Font.BOLD, 9);
                        Font nRE= new Font ("SERIF", Font.BOLD, 9);                                            
                        Font obli= new Font ("SERIF", Font.HANGING_BASELINE, 9);
                        Font ne= new Font ("SANS_SERIF", Font.BOLD, 10);
//                        double gua=0,gua2=0,tutu=0;
                        gua=antes_tot+sm-sm2;
                        gua2=antes_tot2+sm3-sm4;
                        tutu=gua+gua2;
//                        ya sabes ya sabes ya sabes ya sabes ya sabes ya sabes ya sabes ya sabes ya sabes ya sabes ya sabes
                        int mss=Integer.parseInt(mesi),aññ=Integer.parseInt(añ);
                        double actual,actual2;
                        int avisalon2=0,indche2=0;
//                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                        for (int i = 0; i < almacen3.getSize(); i++) {
                                Articulo3 mostrar3 = ( Articulo3) almacen3.getArticulo3(i);
                                if (mostrar3.getf()==mss && mostrar3.gete()==aññ ) {
                                    if ( mostrar3.getc()==gua && mostrar3.getc2()==gua2)
                                        {avisalon2=1;
                                     indche2=0;
                                     i=almacen3.getSize();
                                    }
                                    else          
                                    {avisalon2=2;indche2=mostrar3.getid_e();i=almacen3.getSize();
                                        try{
                                            r=null;
                                            mos.intro("UPDATE totalll SET ct="+gua+",ct2="+gua2+" WHERE id_tot="+indche2);
                                             if(mos.soplon()==1)
                                            JOptionPane.showMessageDialog(this,"regiatrado correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
           
                                             } catch(Exception error){
                                                System.out.println("Clase no encontrada");
                                             }
                                    
                                    }
                                }else
                                {indche2=mostrar3.getid_e()+1;avisalon2=0;}
                        }   
//                        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                              if(indche2!=0 && avisalon2==0){
                                  try{
                                      r=null;
                                      mos.intro("insert into totalll values ("+indche2+","+mss+","+aññ+","+gua+","+gua2+")");
                                             if(mos.soplon()==1)
                                            JOptionPane.showMessageDialog(this,"regiatrado correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
            
                                 } catch(Exception error){
                                      System.out.println("Clase no encontrada");
                                 }
                              }
//                        fin de lo planeado, fin de lo planeado, fin de lo planeado, fin de lo planeado, fin de lo planeado, 
                        
                        paginas.setFont(ne);
                        paginas.drawString("CONCILIACIÓN DE LA HOJA DE CUENTAS", 64, 414);
                        paginas.setFont(negr);
                        paginas.drawString("PARA EL MES QUE TERMINA EL:_____________________", 48, 434);
                        paginas.setFont(nRE);
                        paginas.drawString("RECIBIDO:", 40, 458);
                        paginas.setFont(norm);
                        paginas.drawString("Saldo anterior                 $ ______________", 46, 470);
                        paginas.drawString(""+antes_tot, 150, 470);
                        paginas.setFont(negr);
                        paginas.drawString("ENTRADA:                    ______________+", 49, 480);
                        paginas.drawString(""+sm, 150, 480);
                        paginas.drawString("SALIDA                          ______________-", 49, 490);
                        paginas.drawString(""+sm2, 150, 490);
                        paginas.setFont(norm);
                        paginas.drawString("Saldo restante:                                                    $______________", 49, 500);
                        paginas.drawString(""+gua, 230, 500);
                        paginas.setFont(norm);
                        paginas.drawString("(Si el saldo restante no es igual a cero, veánse las", 49, 510);
                        paginas.setFont(obli);
                        paginas.drawString("Instrucciones", 228, 510);
                        paginas.drawString("para la contabilidad de la congregacion[S-27].)", 49, 520);
                        //****************************************************************************************
                       
                        paginas.setFont(nRE);
                        paginas.drawString("CUENTA CORRIENTE:", 40, 540);
                        paginas.setFont(norm);
                        paginas.drawString("Saldo anterior                 $ ______________", 46, 550);
                        paginas.drawString(""+antes_tot2, 150, 550);
                        paginas.setFont(negr);
                        paginas.drawString("ENTRADA:                    ______________+", 49, 560);
                        paginas.drawString(""+sm3, 150, 560);
                        paginas.drawString("SALIDA                          ______________-", 49, 570);
                        paginas.drawString(""+sm4, 150, 570);
                        paginas.setFont(norm);
                        paginas.drawString("Saldo restante:                                                    $______________", 49, 580);
                        paginas.drawString(""+gua2, 230, 580);
                        paginas.setFont(norm);
                        paginas.drawString("(Esta cantidad debe ser igual que el saldo de la chequera para el ", 49, 590);
                        paginas.setFont(obli);
                        paginas.drawString("último día del mes.", 49, 600);
                        //********************************************************************************************                       
                        paginas.setFont(nRE);
                        paginas.drawString("OTRO_______________:", 40, 620);
                        paginas.setFont(norm);
                        paginas.drawString("Saldo anterior                 $ ______________", 46, 630);
                        paginas.setFont(negr);
                        paginas.drawString("ENTRADA:                    ______________+", 49, 640);
                        paginas.drawString("SALIDA                          ______________-", 49, 650);
                        paginas.setFont(norm);
                        paginas.drawString("Saldo restante:                                                    $______________", 49, 660);
                       //***************************************************
                        paginas.setFont(nRE);
                        paginas.drawString("TOTAL DE LOS FONDOS A FIN DE MES:", 40, 680);
                        paginas.drawLine(225, 680, 290, 680);
                        paginas.drawLine(225, 682, 290, 682);
                        paginas.drawString("$  "+tutu, 220, 678);
                        paginas.setFont(norm);
                        paginas.drawString("Nota: ´Los saldos´ restantes de las columnas de arriba deben", 40, 710);
                        paginas.drawString("anotarse en la siguiente ´Conciliación de la hoja de cuentas´ como ", 40, 720);
                        paginas.drawString("´Saldo anterior´.", 40, 730);
//**************************************************************************************************************
                        
                        paginas.setFont(ne);
                        paginas.drawString("OBLIGACIONES A FIN DE MES", 355, 414);
                        paginas.setFont(nRE);
                        paginas.drawString("ACTUALES:", 315, 455);
                        int lin=468;
                        paginas.setFont(norm); 
                        paginas.drawString("___________________________  $____________ ", 322, lin);
                        for(int mm=1;mm<11;mm++){
                          lin=lin+11;
                        paginas.drawString("___________________________    ____________ ", 322, lin);}
                        paginas.drawString("TOTAL                        $______________", 410, lin+20);
                        paginas.setFont(nRE);
                        paginas.drawString("A LARGO PLAZO", 315, lin+55);    
                        int lii=lin+75;
                        paginas.drawString("___________________________  $____________ ", 322, lii);
                        int rr=lii+11;
                        for(int sl=1;sl<=6;sl++){
                        paginas.drawString("___________________________    ____________ ", 322, rr);
                        rr+=11;
                        }
                        paginas.drawString("TOTAL                       $______________", 410, rr+18);
                        paginas.draw3DRect(302, 400, 263, 363, true);
			paginas.dispose();
                        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<                        
                        pj.end();
                        //°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
                           
                        //°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
		}catch(Exception e)
		{
			System.out.println("LA IMPRESION HA SIDO CANCELADA..."+e);
		}
//               °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°
                                          
//               °°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°         
                                  }                        
    }//GEN-LAST:event_IMPRIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
             mos.intro("delete totalll where mm="+this.mes.getText()+"and aa="+this.año.getText());
              if(mos.soplon()==1)
                 JOptionPane.showMessageDialog(this,"eliminado correctamente","atencion",JOptionPane.INFORMATION_MESSAGE);
           
    }//GEN-LAST:event_EliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton IMPRI;
    private javax.swing.JTextField año;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField congregacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField provincia;
    // End of variables declaration//GEN-END:variables
}
//UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU
//********************************************************************************************************************

class Escaparate {
    
     private LinkedList catalogo = new LinkedList() ;

     public void addArticulo(String id_in, String f, String e, String c, String com, String cfsr,String ccc,String nom_ott,String ott) {
         Articulo art = new Articulo(id_in, f, e, c,com,cfsr,ccc,nom_ott,ott);
         catalogo.add(art);
     }

     public Articulo getArticulo(int i) {
         return (Articulo) catalogo.get(i);
     }

     public int getSize() {
         return catalogo.size( ) ;
     }

     public void sort() {
         Collections.sort(catalogo) ;
     }
}

class Articulo implements Comparable {
     private int id_in;
     private int f;
     private int e;
     private int c;
     private double com;
     private double cfsr;
     private double ccc;
     private String nom_ott;
     private double ott;
     

     Articulo(String id_in, String f, String e,
         String c, String com, String cfsr,String ccc,String nom_ott,String ott) {
          this.id_in=Integer.parseInt(id_in);
          this.f=Integer.parseInt(f);
          this.e=Integer.parseInt(e);
          this.c=Integer.parseInt(c);
          this.com=Double.parseDouble(com);
          this.cfsr=Double.parseDouble(cfsr);
          this.ccc=Double.parseDouble(ccc);
          this.nom_ott=nom_ott;
          this.ott=Double.parseDouble(ott);
        
     }
  public int compareTo( Object obj) {
         Articulo temp = (Articulo)obj ;
         
         return 0;
     }
    

     public int getid_in() {
         return  id_in;
     }

     public int getf() {
         return  f;
     }
      public int gete() {
         return  e;
     }
 public int getc() {
         return  c;
     }
      public double getcom() {
         return  com;
     }
     public double getcfsr() {
         return  cfsr;
     }
      public double getccc() {
         return  ccc;
     }
       public String getnom_ott() {
         return  nom_ott;
     }
       public double getott() {
         return  ott;
     }
}

//RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
//********************************************************************************************************************
class Escaparate2 {
    
     private LinkedList catalogo = new LinkedList() ;

     public void addArticulo2(String id_e, String f, String e, String c, String nombre, String ot,String de,String re) {
         Articulo2 art = new Articulo2(id_e, f, e, c,nombre,ot,de,re);
         catalogo.add(art);
     }

     public Articulo2 getArticulo2(int i) {
         return (Articulo2) catalogo.get(i);
     }

     public int getSize() {
         return catalogo.size( ) ;
     }

     public void sort() {
         Collections.sort(catalogo) ;
     }
}

class Articulo2 implements Comparable {
     private int id_e;
     private int f;
     private int e;
     private int c;
     private String nombre;
     private double ot;
     private double de;
     private double re;
   
     

     Articulo2(String id_e, String f, String e,
         String c, String nombre, String ot,String de,String re) {
          this.id_e=Integer.parseInt(id_e);
          this.f=Integer.parseInt(f);
          this.e=Integer.parseInt(e);
          this.c=Integer.parseInt(c);
          this.nombre=nombre;
          this.ot=Double.parseDouble(ot);
          this.de=Double.parseDouble(de);         
          this.re=Double.parseDouble(re);
        
     }
  public int compareTo( Object obj) {
         Articulo2 temp = (Articulo2)obj ;
         
         return 0;
     }
    

     public int getid_e() {
         return  id_e;
     }

     public int getf() {
         return  f;
     }
      public int gete() {
         return  e;
     }
 public int getc() {
         return  c;
     }
      public String getnombre() {
         return  nombre;
     }
     public double getot() {
         return  ot;
     }
      public double getde() {
         return  de;
     }
       public double getre() {
         return  re;
     }
       
}
//________________________________________________________________________________________________________________________________
class Escaparate3 {
    
     private LinkedList catalogo = new LinkedList() ;

     public void addArticulo3(String id_e, String f, String e, String c,String c2) {
         Articulo3 art = new Articulo3(id_e, f, e, c,c2);
         catalogo.add(art);
     }

     public Articulo3 getArticulo3(int i) {
         return (Articulo3) catalogo.get(i);
     }

     public int getSize() {
         return catalogo.size( ) ;
     }

     public void sort() {
         Collections.sort(catalogo) ;
     }
}

class Articulo3 implements Comparable {
     private int id_e;
     private int f;
     private int e;
     private double c;
     private double c2;
    Articulo3(String id_e, String f, String e,
         String c,String c2) {
          this.id_e=Integer.parseInt(id_e);
          this.f=Integer.parseInt(f);
          this.e=Integer.parseInt(e);
          this.c=Double.parseDouble(c);
          this.c2=Double.parseDouble(c2);
             
     }
  public int compareTo( Object obj) {
         Articulo3 temp = (Articulo3)obj ;
         
         return 0;
     }
    

     public int getid_e() {
         return  id_e;
     }

     public int getf() {
         return  f;
     }
      public int gete() {
         return  e;
     }
 public double getc() {
         return  c;
     }         
  public double getc2() {
         return  c2;
     }  
}