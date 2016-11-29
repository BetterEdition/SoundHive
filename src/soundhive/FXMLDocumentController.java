/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundhive;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField textSearch;
    @FXML
    private TableView<String> songTableView;
    @FXML
    private ListView<String> listSong;
    @FXML
    private TableView<String> viewPlayList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void searchClick(ActionEvent event) {
    }

    @FXML
    private void newBtnSong(ActionEvent event) {
    }

    @FXML
    private void editBtnSong(ActionEvent event) {
    }

    @FXML
    private void deleteBtnSong(ActionEvent event) {
    }

    @FXML
    private void closeBtnSong(ActionEvent event) {
    }

    @FXML
    private void newBtnPlayList(ActionEvent event) {
    }

    @FXML
    private void editbtnPlayList(ActionEvent event) {
    }

    @FXML
    private void deleteBtnPlayList(ActionEvent event) {
    }

    @FXML
    private void upBtnSongsOnPl(ActionEvent event) {
    }

    @FXML
    private void downBtnSongsOnPl(ActionEvent event) {
    }

    @FXML
    private void deleteBtnSongsOnPl(ActionEvent event) {
    }
    
}
