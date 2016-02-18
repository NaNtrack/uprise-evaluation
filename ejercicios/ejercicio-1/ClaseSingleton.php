<?php

final class ClaseSingleton {
    
    /**
     * Retorna una nueva instancia de esta clase
     * 
     * @return ClaseSingleton
     */
    public static function factory() {
        return new self();
    }
    
    /**
     * Hello world!
     * 
     * @return string
     */
    public function hello() {
        return "Hello world!";
    }
    
}
