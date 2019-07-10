
package practica_proyecto;

/**
 *
 * @author migfe
 */
public class hash {
    //retorna un hash a partir de un tipo  y un texto
    public static String getHash (String txt, String hashType){
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            
            for (int i = 0; i < array.length; i++) {
                sb.append(Integer.toHexString((array[i] & 0xff) | 0x100).substring(1,3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    //Retorna un hash md5 a partir de un texto 
    public static String md5(String txt){
        return hash.getHash(txt, "MD5");
    }
    //Retorna un hash SHA1 a partir de un texto
    public static String sha1(String txt){
        return hash.getHash(txt, "SHA1");
    }
    
    
}
