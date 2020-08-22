package com.sebastianczech.api

import groovyx.net.http.RESTClient
import spock.lang.Shared
import spock.lang.Specification

class ApiApplicationSpockSpec extends Specification {

    @Shared
    def client = new RESTClient("http://localhost:48080")
//    def client = new RESTClient("$SERVER_URL:$SERVER_PORT")

//    https://www.blazemeter.com/blog/testing-your-api-assertions-with-the-spock-framework/

    def 'should return 200 code when trying to show info'() {
        when: 'get /info'
        def response = client.get(path: '/info')

        then: 'server returns 200 code (ok)'
        assert response.status == 200: 'response code should be 200 when tried to show info '
    }

}