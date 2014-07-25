package de.vahrson.pt.om.map;

import java.util.Date;
import java.math.BigDecimal;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.TableMap;

/**
  *  This class was autogenerated by Torque on:
  *
  * [Thu Mar 17 11:26:19 CET 2005]
  *
  */
public class PcrProductMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "de.vahrson.pt.om.map.PcrProductMapBuilder";


    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public void doBuild() throws TorqueException
    {
        dbMap = Torque.getDatabaseMap("pt");

        dbMap.addTable("pcr_product");
        TableMap tMap = dbMap.getTable("pcr_product");

                tMap.setPrimaryKeyMethod(TableMap.ID_BROKER);
        
                tMap.setPrimaryKeyMethodInfo(tMap.getName());
        
                                      tMap.addPrimaryKey("pcr_product.PCR_PRODUCT_ID", new Integer(0));
                                                        tMap.addForeignKey(
                "pcr_product.LEFT_HIT_ID", new Integer(0) , "hit" ,
                    "hit_id");
                                                        tMap.addForeignKey(
                "pcr_product.RIGHT_HIT_ID", new Integer(0) , "hit" ,
                    "hit_id");
                                                        tMap.addColumn("pcr_product.SEQUENCE", new String());
                                                        tMap.addColumn("pcr_product.SEQLEN", new Integer(0));
                                                        tMap.addColumn("pcr_product.TM", new Double(0));
                                                        tMap.addColumn("pcr_product.GC", new Double(0));
                                                        tMap.addColumn("pcr_product.STATUS", new Integer(0));
                                                        tMap.addColumn("pcr_product.CREATOR", new String());
                              }
}
