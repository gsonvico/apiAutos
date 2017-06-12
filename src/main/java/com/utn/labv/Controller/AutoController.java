package com.utn.labv.Controller;

import com.utn.labv.ListAutos.DAOAutos;
import com.utn.labv.Model.Auto;
import com.utn.labv.Model.Marca;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Enumeration;

/**
 * Created by Gustavo on 31/5/2017.
 */
@Controller
public class AutoController {

    @Autowired
    private DAOAutos listAutos;

    @RequestMapping(value = "/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Enumeration<Auto> byAll()
    {
        return listAutos.byAll();
    }

    @RequestMapping(value = "/Autos/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Auto byId(@PathVariable("id") Integer id){
        return listAutos.byId(id);
    }

    @RequestMapping(value = "/Autos/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Enumeration<Auto> byMarca(@RequestParam(value="marca") String marca)
    {
        return listAutos.byMarca(new Marca(marca));
    }


    @RequestMapping(value="/Autos", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addAuto(@RequestBody Auto auto)
    {
        try {
            listAutos.addAuto(new Auto(auto.getModelo(), auto.getMarca(), auto.getKilometros(), auto.getAnio()));
            return new ResponseEntity(HttpStatus.CREATED);
        }catch (Exception e)
        {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
