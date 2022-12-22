public class Execute
{
public static void main(String[] args)
{
    FrameWork call=new FrameWork();
    ExtractData calling =new ExtractData();
    calling.existanceCheck();
    String presentInput="";
    while(true )
    {
        presentInput=call.input.getText();
        try
        {
            call.output.setText(" ");
            call.instantConvert(presentInput);
            Thread.sleep(1000);
        }
        catch(Exception exception)
        {
            call.output.setText("Error occor While Converting");
            exception.printStackTrace();
        }
    }
}
}