package mx.com.xoco.nuniez.entities.Z11116;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity(name = "UserConnection")
@Table(name = "UserConnection", indexes = {
        @Index(name = "UserConnectionRank", columnList = "userId, providerId, rank"),
        @Index(name = "providerUserId_idx", columnList = "providerUserId"),
        @Index(name = "userId_idx", columnList = "userId") })
//@NamedQueries({ @NamedQuery(name = UserConnectionDao.USER_CONNECTION_FIND_BY_PROVIDER_ID, query = UserConnectionDao.USER_CONNECTION_FIND_BY_PROVIDER_ID) })
@Setter
@Getter
public class UserConnection implements Serializable {
    private static final long serialVersionUID = 8710072028587846944L;

    @EmbeddedId
	@Id
    private UserConnectionId userConnectionId;

    @NotNull
    private Integer rank;

    private String displayName;
    @Column(length = 512, columnDefinition = "TEXT")
    private String profileUrl;
    @Column(length = 512, columnDefinition = "TEXT")
    private String imageUrl;

    @NotNull
    @Column(length = 2048)
    private String accessToken;

    private String secret;

    @Column(length = 2048)
    private String refreshToken;
    private Long expireTime;
    private String redirectUri;

    public UserConnection() {
    }

    public UserConnection(UserConnectionId userConnectionId, Integer rank, String displayName, String profileUrl,
                          String imageUrl, String accessToken, String secret, String refreshToken, Long expireTime) {
        this.userConnectionId = userConnectionId;
        this.rank = rank;
        this.displayName = displayName;
        this.profileUrl = profileUrl;
        this.imageUrl = imageUrl;
        this.accessToken = accessToken;
        this.secret = secret;
        this.refreshToken = refreshToken;
        this.expireTime = expireTime;
        this.redirectUri = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserConnection)) {
            return false;
        }

        UserConnection that = (UserConnection) o;

        if (!accessToken.equals(that.accessToken)) {
            return false;
        }
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) {
            return false;
        }
        if (expireTime != null ? !expireTime.equals(that.expireTime) : that.expireTime != null) {
            return false;
        }
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null) {
            return false;
        }
        if (profileUrl != null ? !profileUrl.equals(that.profileUrl) : that.profileUrl != null) {
            return false;
        }
        if (!rank.equals(that.rank)) {
            return false;
        }
        if (refreshToken != null ? !refreshToken.equals(that.refreshToken) : that.refreshToken != null) {
            return false;
        }
        if (secret != null ? !secret.equals(that.secret) : that.secret != null) {
            return false;
        }
        if (redirectUri != null ? !redirectUri.equals(that.redirectUri) : that.redirectUri != null) {
            return false;
        }
        if (userConnectionId != null ? !userConnectionId.equals(that.userConnectionId) : that.userConnectionId != null) {
            return false;
        }

        return true;
    }

    @Embeddable
    @Getter
    @Setter
    public static class UserConnectionId implements Serializable {
        private static final long serialVersionUID = -4863375453290004246L;
        @NotNull
        private Long userId;
        private String providerId;
        private String providerUserId;

        @Transient
        @JsonInclude
        private String providerName;

        public UserConnectionId(Long userId, String providerId, String providerUserId) {
            this.userId = userId;
            this.providerId = providerId;
            this.providerUserId = providerUserId;
        }

        public UserConnectionId() {
            userId = null;
            providerId = "";
            providerUserId = "";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            UserConnectionId other = (UserConnectionId) obj;
            if (providerId == null) {
                if (other.providerId != null) {
                    return false;
                }
            } else if (!providerId.equals(other.providerId)) {
                return false;
            }
            if (providerUserId == null) {
                if (other.providerUserId != null) {
                    return false;
                }
            } else if (!providerUserId.equals(other.providerUserId)) {
                return false;
            }
            if (providerName == null) {
                if (other.providerName != null) {
                    return false;
                }
            } else if (!providerName.equals(other.providerName)) {
                return false;
            }
            if (userId == null) {
                if (other.userId != null) {
                    return false;
                }
            } else if (!userId.equals(other.userId)) {
                return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((providerId == null) ? 0 : providerId.hashCode());
            result = prime * result + ((providerUserId == null) ? 0 : providerUserId.hashCode());
            result = prime * result + ((userId == null) ? 0 : userId.hashCode());
            result = prime * result + ((providerName == null) ? 0 : providerName.hashCode());
            return result;
        }
    }

}
