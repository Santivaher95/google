package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Ruta al ejecutable de ChromeDriver (asegúrate de tenerlo descargado)
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

        // Inicializar el navegador Chrome
        WebDriver driver = new ChromeDriver();

        // Ejemplo: abrir Google
        driver.get("https://www.google.com");

        // Pausa para que puedas ver el navegador abierto (opcional)
        try {
            Thread.sleep(500000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cerrar el navegador
        driver.quit();
    }
}