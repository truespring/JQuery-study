package com.dhi.prevision.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class NotifyRepository {

    public String insertNewNotifyEmail(String alarmGroupName ,Long pamTagMappingSeqs, Long incidentSeqs, Long alarmGroupStatusCodeSeqs) {
        String sql = new StringBuilder()
                .append(" INSERT INTO NOTIFY_EMAIL_HISTORY (ALARM_GROUP_SEQ, USER_SEQ, CHECK_YN) " )
                .append(" ( " )
                .append("           SELECT agm.ALARM_GROUP_SEQ, uri.USER_SEQ, 'N' " )
                .append("           FROM ALARM_GROUP_MASTER agm " )
                .append("           INNER JOIN PAM_TAG_MAPPING ptm " )
                .append("           ON agm.PAM_TAG_MAPPING_SEQ = ptm.PAM_TAG_MAPPING_SEQ " )
                .append("           INNER JOIN PAM_MAPPING pm " )
                .append("           ON ptm.PAM_MAPPING_SEQ = pm.PAM_MAPPING_SEQ " )
                .append("           INNER JOIN USER_PLANT_INFO upi " )
                .append("           ON pm.PLANT_SEQ = upi.ACCESSIBLE_PLANT_SEQ " )
                .append("           INNER JOIN USER_ROLE_INFO uri " )
                .append("           ON upi.USER_SEQ = uri.USER_SEQ " )
                .append("           INNER JOIN ROLE_MASTER rm " )
                .append("           ON uri.USER_ROLE_SEQ = rm.ROLE_ID ")
                .append("           WHERE agm.ALARM_GROUP_NAME = " ).append(alarmGroupName)
                .append("           AND agm.PAM_TAG_MAPPING_SEQ = " ).append(pamTagMappingSeqs)
                .append("           AND agm.INCIDENT_SEQ = " ).append(incidentSeqs)
                .append("           AND agm.ALARM_GROUP_STATUS_CODE_SEQ = " ).append(alarmGroupStatusCodeSeqs)
                .append("           AND " )
                .append("               ( " )
                .append("                      rm.ROLE_ID = 1 ")
                .append("                   OR rm.ROLE_ID = 10 " )
                .append("               ) " )
                .append(" ) " ).toString();
        return sql;
    }

    public String insertNewNotifyPopup(String alarmGroupName ,Long pamTagMappingSeqs, Long incidentSeqs, Long alarmGroupStatusCodeSeqs) {
        String sql = new StringBuilder()
                .append(" INSERT INTO NOTIFY_POPUP_HISTORY (ALARM_GROUP_SEQ, USER_SEQ, CHECK_YN) " )
                .append(" ( " )
                .append("           SELECT agm.ALARM_GROUP_SEQ, uri.USER_SEQ, 'N' " )
                .append("           FROM ALARM_GROUP_MASTER agm " )
                .append("           INNER JOIN PAM_TAG_MAPPING ptm " )
                .append("           ON agm.PAM_TAG_MAPPING_SEQ = ptm.PAM_TAG_MAPPING_SEQ " )
                .append("           INNER JOIN PAM_MAPPING pm " )
                .append("           ON ptm.PAM_MAPPING_SEQ = pm.PAM_MAPPING_SEQ " )
                .append("           INNER JOIN USER_PLANT_INFO upi " )
                .append("           ON pm.PLANT_SEQ = upi.ACCESSIBLE_PLANT_SEQ " )
                .append("           INNER JOIN USER_ROLE_INFO uri " )
                .append("           ON upi.USER_SEQ = uri.USER_SEQ " )
                .append("           INNER JOIN ROLE_MASTER rm " )
                .append("           ON uri.USER_ROLE_SEQ = rm.ROLE_ID ")
                .append("           WHERE agm.ALARM_GROUP_NAME = " ).append(alarmGroupName)
                .append("           AND agm.PAM_TAG_MAPPING_SEQ = " ).append(pamTagMappingSeqs)
                .append("           AND agm.INCIDENT_SEQ = " ).append(incidentSeqs)
                .append("           AND agm.ALARM_GROUP_STATUS_CODE_SEQ = " ).append(alarmGroupStatusCodeSeqs)
                .append("           AND " )
                .append("               ( " )
                .append("                      rm.ROLE_ID = 1 ")
                .append("                   OR rm.ROLE_ID = 10 " )
                .append("               ) " )
                .append(" ) " ).toString();
        return sql;
    }
}
