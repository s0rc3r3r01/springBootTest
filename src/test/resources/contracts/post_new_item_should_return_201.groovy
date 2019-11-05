org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/todos/1'
    }
    response {
        status 201
        body(["1"])
    }
}

//POST /todos - Should return a 201 as the item does not exist