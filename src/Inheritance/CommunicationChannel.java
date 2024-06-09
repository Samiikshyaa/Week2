package Inheritance;

public class CommunicationChannel {
    private String account;
    private String activeStatus;

    public CommunicationChannel(String account, String activeStatus) {
        this.account = account;
        this.activeStatus = activeStatus;
    }

    public void audio_call(){
        if (activeStatus.equalsIgnoreCase("active")){
            System.out.println("Audio Calling...");
        } else {
            System.out.println("The person is not available.");
        }
    }
    public void video_call(){
        if (activeStatus.equalsIgnoreCase("active")){
            System.out.println("Video Calling...");
        }else {
            System.out.println("The person is not available.");
        }
    }

}
