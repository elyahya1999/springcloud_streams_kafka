package org.sid.demospringcloudstreamskafka.entities;

import lombok.*;

import java.util.Date;
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Getter @Setter @Builder
public class PageEvent {
    private String name;
    private String user;
    private Date date;
    private long duration;
}
