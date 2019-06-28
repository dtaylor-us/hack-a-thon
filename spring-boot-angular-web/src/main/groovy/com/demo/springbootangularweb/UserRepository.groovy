package com.demo.springbootangularweb

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository extends CrudRepository<User, Long> {}