import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;


/**
 *
 * @author 421 Sweet Devil
 */
public final class process extends Thread{
    String password; BufferedReader br1 = null,br2=null,br3=null;
    Boolean found=false;
    String fileName = "Resources\\list.txt";
    int threadsRunning;
    
    process(){
        this.start();
    }
    
    @Override
    public void run(){
        try {
            InsertFile();
        } catch (ZipException ex) {
            Logger.getLogger(process.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void InsertFile() throws ZipException{
            // Initiate ZipFile object with the path/name of the zip file.
         //   System.out.println("Opening Zip file");
            
            String key;
            JOptionPane.showMessageDialog(null,"Please wait","",JOptionPane.PLAIN_MESSAGE);
            
            while(!found){
                useSelector(Frame.wordSize);
            }
                
        
    }
    String getPassword(){return password;}
   
    String changePath(String path){
        return path.replaceAll("\\\\","\\\\\\\\");
    }
    Boolean checkPassword(String key,ZipFile zipFile){
        try{
                System.out.println(key);
                zipFile.setPassword(key);
                zipFile.extractAll("C:\\\\Desktop");
                System.out.println("Password is: "+key);
                
                JOptionPane.showMessageDialog(null,"The Password is: "+key,"Password Found",JOptionPane.PLAIN_MESSAGE);
                return true;
        }catch(ZipException ze){ze.getCode();}
        catch(HeadlessException ze){ze.getMessage();}
        return false;
    }
    
    void useSelector(int wordSize) throws ZipException{
         System.out.println("useSelector");StringBuilder key=new StringBuilder();
        StringBuilder key2=new StringBuilder();
        StringBuilder key3=new StringBuilder();
        br1 = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName))); 
        br2 = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));
        br3 = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));
        ZipFile zipFile = new ZipFile(changePath(Frame.path));
        
        
        Boolean nullFound,case1=false,case2=false;
        
        Outer:
        
        try{
            System.out.println("within Outer");
            if(found){
               return;
            }
            switch(wordSize){
                case 1: 
                    try{
                        key.replace(0, 0, "");
                        while(key.replace(0,key.length(),br1.readLine()) != null){ 
                            useStartsWith(key.toString(),zipFile);
                        }
                    }catch(NullPointerException e){
                        useSelector(2);
                        System.out.println("NP exception");
                    }
                case 2:
                    try{
                        key.replace(0, 0, "");
                        key2.replace(0, 0, "");
                        while((key.replace(0,key.length(),br1.readLine()))!= null){ 
                            while ((key2.replace(0,key2.length(),br2.readLine()))!= null){ 
                               useStartsWith(""+key+key2,zipFile);
                                if(found){
                                    break Outer;
                                }
                            }
                        }
                    }catch(NullPointerException e){useSelector(3);}
                case 3:
                    try{
                        key.replace(0, 0, "");
                        key2.replace(0, 0, "");
                        key3.replace(0, 0, "");
                        while((key.replace(0,key.length(),br1.readLine()))!= null){ 
                            while ((key2.replace(0,key2.length(),br2.readLine()))!= null){ 
                                while ((key3.replace(0,key3.length(),br3.readLine()))!= null){ 
                                    useStartsWith(""+key+key2+key3,zipFile);
                                    if(found){
                                        break Outer;
                                    }
                                }
                            }
                        }
                    }catch(NullPointerException e){System.out.println("Password Not Found!!");}
            }
        }catch(IOException io){}
    }
    String useStartsWith(String key,ZipFile zipFile){
        if(Frame.startsWith.equals("")){
         //   System.out.println("Inside Without StartsWith");
            if(useEndsWith(key,zipFile)){
                    found=true;
            }
        }
        else{
            if(key.startsWith(Frame.startsWith)){
           //     System.out.println("Inside With StartsWith");
                if(useEndsWith(key,zipFile)){
                    found=true;
                }
            }
        }
        return "";
    }
    
    Boolean useEndsWith(String key,ZipFile zipFile){
        if(Frame.endsWith.equals("")){
            //System.out.println("Inside Without endsWith");
            if(checkPassword(key,zipFile)){
                    found=true;
            }
        }
        else{
            if(key.endsWith(Frame.endsWith)){
              //  System.out.println("Inside With endsWith");
                if(checkPassword(key,zipFile)){
                    found=true;
                }
            }
        }
        return false;
    }
}
