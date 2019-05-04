package kalkulator;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KalkulatorJavaFX extends Application {
    
    Kalkulator kalk = new Kalkulator();
    Scene glownaScene;
    boolean flaga = false;
    double wartosc;
    int rodzaj_dzialania;
    
    @Override
    public void start(final Stage primaryStage) throws InterruptedException {
        
        // Tworzenie siatki pionowej
        VBox glownaVBox = new VBox(5);
        glownaVBox.setPadding(new Insets(5));
        
        // Tworzenie etykiety napisLiczby
        Label napisLiczbyLabel = new Label();
        napisLiczbyLabel.setText("0");
        glownaVBox.getChildren().add(napisLiczbyLabel);
        
        // Tworzenie siatki poziomej numery123
        HBox numery123HBox = new HBox(5);
        
        // Tworzenie przycisku numer1
        Button numer1Button = new Button("1");
        numer1Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("1");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("1");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Tworzenie przycisku numer2
        Button numer2Button = new Button("2");
        numer2Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("2");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("2");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Tworzenie przycisku numer3
        Button numer3Button = new Button("3");
        numer3Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("3");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("3");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Dodanie przyciskow 1, 2, 3 do siatki poziomej
        numery123HBox.getChildren().add(numer1Button);
        numery123HBox.getChildren().add(numer2Button);
        numery123HBox.getChildren().add(numer3Button);
        
        // Dodanie siatki poziomej 123 do siatki pionowej
        glownaVBox.getChildren().add(numery123HBox);
        
        // Tworzenie siatki poziomej numery 456
        HBox numery456HBox = new HBox(5);
        
        // Tworzenie przycisku numer4
        Button numer4Button = new Button("4");
        numer4Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("4");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("4");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Tworzenie przycisku numer5
        Button numer5Button = new Button("5");
        numer5Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("5");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("5");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Tworzenie przycisku numer6
        Button numer6Button = new Button("6");
        numer6Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("6");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("6");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Dodanie przyciskow 4, 5, 6 do siatki poziomej
        numery456HBox.getChildren().add(numer4Button);
        numery456HBox.getChildren().add(numer5Button);
        numery456HBox.getChildren().add(numer6Button);
        
        // Dodanie siatki poziomej 456 do siatki pionowej
        glownaVBox.getChildren().add(numery456HBox);
        
        // Tworzenie siatki poziomej numery 789
        HBox numery789HBox = new HBox(5);
        
        // Tworzenie przycisku numer7
        Button numer7Button = new Button("7");
        numer7Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("7");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("7");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Tworzenie przycisku numer8
        Button numer8Button = new Button("8");
        numer8Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("8");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("8");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Tworzenie przycisku numer9
        Button numer9Button = new Button("9");
        numer9Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("9");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("9");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Dodanie przyciskow 7, 8, 9 do siatki poziomej
        numery789HBox.getChildren().add(numer7Button);
        numery789HBox.getChildren().add(numer8Button);
        numery789HBox.getChildren().add(numer9Button);
        
        // Dodanie siatki poziomej 789 do siatki pionowej
        glownaVBox.getChildren().add(numery789HBox);
        
        // Tworzenie siatki poziomej numer0C
        HBox numer0C = new HBox(5);
        
        // Tworzenie przycisku numer0
        Button numer0Button = new Button("0");
        numer0Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!flaga)
                {
                    kalk.dodajDoLiczbyNapis("0");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else
                {
                    kalk.setLiczbaNapis("");
                    kalk.dodajDoLiczbyNapis("0");
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    flaga = false;
                }
            }
        });
        
        // Tworzenie przycisku numerC
        Button numerCButton = new Button("C");
        numerCButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                kalk.setLiczbaNapis("");
                napisLiczbyLabel.setText("0");
            }
        });
        
        // Tworzenie przycisku plusminus
        Button plusminusButton = new Button("+/-");
        plusminusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(!kalk.getLiczbaNapis().isEmpty())
                {
                    if(kalk.getLiczbaNapis().charAt(0) == '-')
                    {
                        kalk.setLiczbaNapis(kalk.getLiczbaNapis().substring(1));
                        napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    }
                    else
                    {
                        kalk.setLiczbaNapis('-'+kalk.getLiczbaNapis());
                        napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    }   
                }
            }
        });
        
        // Dodanie przyciskow numer0, numerC i plusminus do siatki poziomej
        numer0C.getChildren().add(numer0Button);
        numer0C.getChildren().add(numerCButton);
        numer0C.getChildren().add(plusminusButton);
        
        // Dodanie siatki poziomej do siatki pionowej;
        glownaVBox.getChildren().add(numer0C);
        
        
        // Tworzenie siatki poziomej operacje
        HBox operacjeHBox = new HBox(5);
        
        Button dodajButton = new Button("+");
        dodajButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                wartosc = Double.parseDouble(napisLiczbyLabel.getText());
                flaga = true;
                rodzaj_dzialania = 1;
            }
        });
        
        Button odejmijButton = new Button("-");
        odejmijButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                wartosc = Double.parseDouble(napisLiczbyLabel.getText());
                flaga = true;
                rodzaj_dzialania = 2;
            }
        });
        
        Button pomnozButton = new Button("*");
        pomnozButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                wartosc = Double.parseDouble(napisLiczbyLabel.getText());
                flaga = true;
                rodzaj_dzialania = 3;
            }
        });
        
        Button podzielButton = new Button("/");
        podzielButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                wartosc = Double.parseDouble(napisLiczbyLabel.getText());
                flaga = true;
                rodzaj_dzialania = 4;
            }
        });
        
        Button rownaSieButton = new Button("=");
        rownaSieButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(rodzaj_dzialania == 1)
                {
                    kalk.dodaj(wartosc);
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else if(rodzaj_dzialania == 2)
                {
                    kalk.odejmij(wartosc);
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else if(rodzaj_dzialania == 3)
                {
                    kalk.pomnoz(wartosc);
                    napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                }
                else if(rodzaj_dzialania == 4)
                {
                    if(wartosc == 0) napisLiczbyLabel.setText("Nie dziel przez 0!");
                    else
                    {
                        kalk.podziel(wartosc);
                        napisLiczbyLabel.setText(kalk.getLiczbaNapis());
                    }
                }
                
                kalk.setLiczbaNapis("");
            }
        });
        
        operacjeHBox.getChildren().add(dodajButton);
        operacjeHBox.getChildren().add(odejmijButton);
        operacjeHBox.getChildren().add(pomnozButton);
        operacjeHBox.getChildren().add(podzielButton);
        operacjeHBox.getChildren().add(rownaSieButton);
        
        glownaVBox.getChildren().add(operacjeHBox);
        
        Button zakonczButton = new Button("Zakoncz");
        zakonczButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });
        
        glownaVBox.getChildren().add(zakonczButton);
        
        // Tworzenie scen
        glownaScene = new Scene(glownaVBox, 400, 500);
        
        // Ustalenie tytulu, glownej sceny i pokazanie glownej sceny
        primaryStage.setTitle("Kalkulator");
        primaryStage.setScene(glownaScene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
