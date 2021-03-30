/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author User
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* อยากอัพไฟล์ Seventeen : home run แต่ต้องมาเช็คเสียง ต้องบีบอัดไฟล์ หาไอดีให้ถึงอัพโหลดขึ้น 
        เราสร้าง class หนึ่งมาทำให้หมดเรยยยยย  */
        VideoFacade vdo = new VideoFacade();
        String s = vdo.UploadVideoAndGetUrl("Seventeen : home run");
        System.out.println(s);
        
    }
    
}
