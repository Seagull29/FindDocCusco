package com.uac.finddoccusco.util;

import com.uac.finddoccusco.R;
import com.uac.finddoccusco.cards.MedicoGeneral;

import java.util.ArrayList;

public class Medicos {


    private static final ArrayList<MedicoGeneral> medicos = new ArrayList<MedicoGeneral>();

    static {
        addItem(new MedicoGeneral("Jimmy Roberto", "Flores Zambrano", R.drawable.doch, "Gastroenterólogo", "jimmyfz@gmail.com", "M", "Clínica peruano-suiza, segundo piso", "984739572", -13.526131054654707, -71.94567688077352, addHorarios(new String[]{
                "15:00 - 16:00", "", "15:00 - 16:00", "", "15:00 - 16:00", "", ""
        })));
        addItem(new MedicoGeneral("Zany Sigrid", "Frisancho Triveño", R.drawable.docm, "General", "zanyfrisancho@gmail.com", "F", "Av. Argentina E-12", "984841297", -13.518650, -71.961507, addHorarios(new String[]{
                "", "", "", "", "", "", ""
        })));
        addItem(new MedicoGeneral("Efrain", "Alcazar Gómez", R.drawable.efrainalcazar, "Cirujano", "Efrain_alcazar@hotmail.com", "M", "Clínica Cornejo, San Sebastián", "984205444", -13.52856607289404, -71.93985749134643, addHorarios(new String[]{
                "14:00 - 18:00; 20:00 - 21:00", "14:00 - 18:00; 20:00 - 21:00", "14:00 - 18:00; 20:00 - 21:00", "14:00 - 18:00; 20:00 - 21:00", "", "", ""
        })));
        addItem(new MedicoGeneral("Edith Graciela", "Pareja De Fernández Baca", R.drawable.docm, "General", "epareja@uandina.edu.pe", "F", "Hospital Regional del Cusco", "984650904", -13.52380561287035, -71.95473625974799, addHorarios(new String[]{
                "13:00 - 16:00", "13:00 - 16:00", "13:00 - 16:00", "", "", "", ""
        })));
        addItem(new MedicoGeneral("Marianela Elisa Del Rosario", "Valencia Sierra", R.drawable.marianelaelisa, "General", "nelavasi@yahoo.es", "F", "Calle Quera 253-Pasaje Hurtado Int-3", "972703261", -13.519783277345137, -71.979445666949, addHorarios(new String[]{
                "", "18:00 - 19:00", "", "18:00 - 19:00", "", "", ""
        })));
        addItem(new MedicoGeneral("Frank Fred", "Carrillo Pino", R.drawable.frankcarrillo, "General", "carrillopinofrank@gmail.com", "M", "Av. Micaela Bastidas, Frente al Min. Agricultura", "966595593", -13.52321181282287, -71.96313341624312, addHorarios(new String[]{
                "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "7:00 - 21:00"
        })));
        addItem(new MedicoGeneral("Henry", "Carrasco Guzmán", R.drawable.henrycarrasco, "Legista", "hcarrascodj@mpfn.gob.pe", "M", "", "984810022", 0, 0, addHorarios(new String[]{
                "13:00 - 14:00", "", "", "", "13:00 - 14:00", "13:00 - 14:00", ""
        })));
        addItem(new MedicoGeneral("Yolanda", "Surco Ochoa", R.drawable.docm, "Gastroenterólogo", "yolita-24@hotmail.com", "F", "Clínica Pardo Of. 504, 5to piso", "978907200", -13.521883080123365, -71.9658065955909, addHorarios(new String[]{
                "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", "7:00 - 21:00", ""
        })));
        addItem(new MedicoGeneral("Yony", "Delgado Santos", R.drawable.docm, "Biólogo", "ydelgado@uandina.edu.pe", "F", "", "969476724", 0, 0, addHorarios(new String[]{
                "", "", "", "", "7:00 - 8:00", "", ""
        })));
        addItem(new MedicoGeneral("Jakeline", "Jayo Silva", R.drawable.docm, "Psiquiatra", "Jakelinejayos@gmail.com", "F", "Urb. Progreso, Jr. Paruro C-8", "984555532", -13.528873573906049, -71.96225314939213, addHorarios(new String[]{
                "17:00 - 21:00", "17:00 - 21:00", "17:00 - 21:00", "17:00 - 21:00", "17:00 - 21:00", "", ""
        })));
        addItem(new MedicoGeneral("Kelly Amanda", "Soto Enríquez", R.drawable.docm, "Psiquiatra", "kellysek2010@hotmail.com", "F", "Edificio San Luis, piso 8", "991069763", -13.533481625357362, -71.90429345997886, addHorarios(new String[]{
                "11:00 - 12:00", "", "", "", "11:00 - 12:00", "11:00 - 12:00", ""
        })));
        addItem(new MedicoGeneral("Julio Paul", "Menendez Sanjines", R.drawable.juliomenendez, "Cirujano", "derman300@hotmail.com", "M", "", "952849990", 0, 0, addHorarios(new String[]{
                "15:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", "7:00 - 19:00", "7:00 - 19:00"
        })));
        addItem(new MedicoGeneral("Karina Verenise", "Segovia Díaz", R.drawable.docm, "Pediatra", "verenisegovia@gmail.com", "F", "Urb. Los Sauces A-1", "913022275", -13.53157336508339, -71.94490145937631, addHorarios(new String[]{
                null, "15:00 - 21:00", "", "15:00 - 21:00", "", "15:00 - 21:00", ""
        })));
        addItem(new MedicoGeneral("Rosa María", "Alfaro Carrasco", R.drawable.rosaalfaro, "Internista", "rosaalfarocarrasco26@gmail.com", "F", "Jr. Sacsayhuaman K-11, Manuel Prado", "958198151", -13.52480526227652, -71.95155702280871, addHorarios(new String[]{
                "15:00 - 19:00", "17:00 - 19:00", "17:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", ""
        })));
        addItem(new MedicoGeneral("Washington Claudio", "Villafuerte Jara", R.drawable.doch, "Neumólogo", "drwashingtonvj@gmail.com", "M", "Av. Jose Gabriel Cosio 403-B, Magisterio", "984760388", -13.52349578887092, -71.9482096173498, addHorarios(new String[]{
                "15:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", "15:00 - 19:00", "9:00 - 13:00", ""
        })));
        addItem(new MedicoGeneral("Gustavo Enrique José", "Bueno Lazo", R.drawable.gustavobueno, "General", "gustavobuenolazo@gmail.com", "M", "Clínica MacSalud", "984003048", -13.524798795682635, -71.95531853831073, addHorarios(new String[]{
                "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00", "", ""
        })));
        addItem(new MedicoGeneral("Nilda", "Conde Cjuiro", R.drawable.docm, "Biólogo", "alerfernil@hotmail.com", "F", "", "984528974", 0, 0, addHorarios(new String[]{
                "18:00 - 19:00", "18:00 - 19:00", "18:00 - 19:00", "18:00 - 19:00", "18:00 - 19:00", "", ""
        })));
        addItem(new MedicoGeneral("Walter", "Vignatti Valencia", R.drawable.doch, "General", "wajuviva@hotmail.com", "M", "", "993747068", 0, 0, addHorarios(new String[]{
                "", "", "", "", "", "", ""
        })));
        addItem(new MedicoGeneral("José Jesús", "Apaza Morales", R.drawable.joseapaza, "Cirujano", "josejesusapazam47@gmail.com", "M", "Urb. Villa San Antonio H-28 San Francisco", "945809839", 0, 0, addHorarios(new String[]{
                "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00", "20:00 - 21:00"
        })));
        addItem(new MedicoGeneral("Oscar", "García Araujo", R.drawable.oscargarcia, "General", "sojuarasojuara@gmail.com", "M", "Clínica Victor Paredes", "997963434", -13.522930380726601, -71.9784090243361, addHorarios(new String[]{
                "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00", "12:00 - 13:00"
        })));
        addItem(new MedicoGeneral("Ever", "Rosenthal Arias", R.drawable.everrosenthal, "Cirujano", "rosenth1@hotmail.com", "M", "Av. La Cultura 1302, Edificio San Luis 8vo piso", "954162526", -13.52456981389389, -71.9565037344014, addHorarios(new String[]{
                "", "18:00 - 19:00", "", "18:00 - 19:00", "", "", ""
        })));
        addItem(new MedicoGeneral("Luis Alberto", "Gonzales Vilca", R.drawable.doch, "General", "eto25@hotmail.com", "M", "Av. Los Incas 1403, 4to piso Consultorio Crecer", "974215225", -13.525016633446267, -71.95599960861274, addHorarios(new String[]{
                "18:00 - 19:00", "18:00 - 19:00", "18:00 - 19:00", "18:00 - 19:00", "18:00 - 19:00", "", ""
        })));
        addItem(new MedicoGeneral("Violeta", "Aragón Carrasco", R.drawable.docm, "Patólogo", "Aragonvioleta@yahoo.es", "F", "", "996230745", 0, 0, addHorarios(new String[]{
                "18:00 - 19:00", "18:00 - 19:00", "8:00 - 9:00", "", "18:00 - 19:00", "18:00 - 19:00", ""
        })));
        addItem(new MedicoGeneral("Charlye", "Pari Caller", R.drawable.charlyepari, "General", "chars123@hotmail.com", "M", "", "979700988", 0, 0, addHorarios(new String[]{
                "15:00 - 18:00", "15:00 - 18:00", "15:00 - 18:00", "15:00 - 18:00", "15:00 - 18:00", "15:00 - 18:00", ""
        })));
        addItem(new MedicoGeneral("Daniel", "Arce Castelo", R.drawable.danielarce, "General", "rancel15@hotmail.com", "M", "Calle Ayacucho 230, int. 202 Bloque C", "950095955", -13.520302867665224, -71.97856144132739, addHorarios(new String[]{
                "9:00 - 10:00; 15:00 - 16:00", "9:00 - 10:00; 15:00 - 16:00", "9:00 - 10:00; 15:00 - 16:00", "9:00 - 10:00; 15:00 - 16:00", "9:00 - 10:00; 15:00 - 16:00", "", ""
        })));
    }

    private static void addItem(MedicoGeneral medico) {
        medicos.add(medico);
    }

    public static  ArrayList<MedicoGeneral> getMedicos() {
        return Medicos.medicos;
    }

    private static ArrayList<String> addHorarios(String[] horarios) {
        ArrayList<String> arrayHorario = new ArrayList<String>();
        for (String horario : horarios) {
            arrayHorario.add(horario);
        }
        return arrayHorario;
    }

    public static ArrayList<MedicoGeneral> filterMedicos(String categoria) {
        ArrayList<MedicoGeneral> medicosFiltrados = new ArrayList<>();
        for (MedicoGeneral medico : Medicos.medicos) {
            if (medico.getCategoria() == categoria) {
                medicosFiltrados.add(medico);
            }
        }
        return medicosFiltrados;

    }






}
