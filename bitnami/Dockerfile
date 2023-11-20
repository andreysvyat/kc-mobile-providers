FROM docker.io/bitnami/keycloak:22

ARG PRV_PATH=/target/providers

# main provider
COPY ["$PRV_PATH/keycloak-phone-provider.jar",\
 "$PRV_PATH/keycloak-phone-provider.resources.jar",\
 "$PRV_PATH/keycloak-sms-provider-dummy.jar",\
 "/opt/bitnami/keycloak/providers/"]