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
public class FileUploader {
    public String UploadVideo(String file) {
        System.out.println("FileUploader " +file);
        return "UB4FzllQCyc";
    }

    public String GetVideoUrlById(String id) {
        // Search the video from its id
        return "https://www.youtube.com/"+id;
    }
}