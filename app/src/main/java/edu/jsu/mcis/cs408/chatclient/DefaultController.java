package edu.jsu.mcis.cs408.chatclient;

public class DefaultController extends AbstractController {

    public static final String ELEMENT_OUTPUT_PROPERTY = "Output";

    public void changeOutputText(String newText) {
        setModelProperty(ELEMENT_OUTPUT_PROPERTY, newText);
    }

    public void sendGetRequest() { invokeModelMethod("sendGetRequest", null);}

    public void sendPostRequest(String input) {
        invokeModelMethod("sendPostRequest",  input);
    }

    public void sendDeleteRequest() {
        invokeModelMethod("sendDeleteRequest", null);
    }

}