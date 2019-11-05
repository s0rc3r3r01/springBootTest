org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        url '/todos/1'
    }
    response {
        status 404
        body($(regex('\\[\\]')))
    }
}