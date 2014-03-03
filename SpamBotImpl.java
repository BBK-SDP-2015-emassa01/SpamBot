
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class SpamBotImpl implements SpamBot{
    
    private URL seedURL;

    @Override
    public void setSeed(String seedUrl) throws MalformedURLException {
        throw new MalformedURLException("Not a good URL."); 
    }

    @Override
    public String getSeed() {
        return this.seedURL.toString();
    }

    @Override
    public void scanSite() {
 
    }

    @Override
    public void setThreads(int count) {
        
    }

    @Override
    public Set<String> getEMails() {
        
    }
    
}
