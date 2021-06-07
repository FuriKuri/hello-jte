void call(number, app_env){
    stage("Perf: Test"){
        println "run perf with ${number}"
        app_env.ip_addresses.each{ ip ->
            println "deploying to ${ip}"
        }
    }
}