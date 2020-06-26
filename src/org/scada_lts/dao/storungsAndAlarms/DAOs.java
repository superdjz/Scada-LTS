package org.scada_lts.dao.storungsAndAlarms;
/*
 * (c) 2020 hyski.mateusz@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
import org.scada_lts.dao.DataPointDAO;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by at Mateusz Hyski
 *
 * @author hyski.mateusz@gmail.com
 */
class DAOs {
    private static PointValuesStorungsAndAlarmsDAO pointValuesStorungsAndAlarmsDAO = new PointValuesStorungsAndAlarmsDAO();
    private static DataPointDAO dataPointDAO = new DataPointDAO();
    enum DAOInstances{
        DATAPOINTDAO,
        POINTVALUESSTORUNGSANDALARMS
    }
    private static Map<DAOInstances,Object> daos = new HashMap<>();
    static {
        daos.put(DAOInstances.POINTVALUESSTORUNGSANDALARMS,pointValuesStorungsAndAlarmsDAO);
        daos.put(DAOInstances.DATAPOINTDAO,dataPointDAO);
    }
    public static PointValuesStorungsAndAlarmsDAO getPointValuesStorungsAndAlarms(){
        return (PointValuesStorungsAndAlarmsDAO) daos.get(DAOInstances.POINTVALUESSTORUNGSANDALARMS);
    }
    public static DataPointDAO getDataPointDAO(){
        return (DataPointDAO) daos.get(DAOInstances.DATAPOINTDAO);
    }
}
