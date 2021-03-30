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
public class VideoFacade {
    public String UploadVideoAndGetUrl(String file)
    {
        VidioCompressor compressor = new VidioCompressor();
        String compressedSteam = compressor.CompressFile(file);
        AudioMixer audio = new AudioMixer();
        boolean canEnhance = audio.CanEnhancement(compressedSteam);
        if(canEnhance)
        {
            compressedSteam = audio.EnhanceAudio(compressedSteam);
        }
        FileUploader uploader = new FileUploader();
        String videoId = uploader.UploadVideo(compressedSteam);
        String url = uploader.GetVideoUrlById(videoId);
        return url;
}
}