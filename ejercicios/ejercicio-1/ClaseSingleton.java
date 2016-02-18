final class ClaseSingleton {
    
    /**
     * Retorna una nueva instancia de esta clase
     * 
     * @return ClaseSingleton
     */
    public static ClaseSingleton factory() {
        return new ClaseSingleton();
    }
    
    /**
     * Hello world!
     * 
     * @return string
     */
    public String hello() {
        return "Hello world!";
    }
    
}
