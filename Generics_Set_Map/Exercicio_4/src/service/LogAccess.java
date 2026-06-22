package service;

import java.time.Instant;

public class LogAccess {
    private String username;
    private Instant date;
   
    public LogAccess() {
        
    }
    public LogAccess(String username, Instant date) {
        this.username = username;
        this.date = date;
    }

     public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Instant getDate() {
        return date;
    }
    public void setDate(Instant date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LogAccess other = (LogAccess) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

}


    
