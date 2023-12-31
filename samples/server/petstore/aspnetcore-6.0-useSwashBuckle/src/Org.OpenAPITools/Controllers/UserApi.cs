/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public abstract class UserApiController : ControllerBase
    { 
        /// <summary>
        /// Create user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="user">Created user object</param>
        /// <response code="0">successful operation</response>
        [HttpPost]
        [Route("/v2/user")]
        [Authorize(Policy = "api_key")]
        [Consumes("application/json")]
        [ValidateModelState]
        public abstract IActionResult CreateUser([FromBody]User user);

        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        /// <param name="user">List of user object</param>
        /// <response code="0">successful operation</response>
        [HttpPost]
        [Route("/v2/user/createWithArray")]
        [Authorize(Policy = "api_key")]
        [Consumes("application/json")]
        [ValidateModelState]
        public abstract IActionResult CreateUsersWithArrayInput([FromBody]List<User> user);

        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        /// <param name="user">List of user object</param>
        /// <response code="0">successful operation</response>
        [HttpPost]
        [Route("/v2/user/createWithList")]
        [Authorize(Policy = "api_key")]
        [Consumes("application/json")]
        [ValidateModelState]
        public abstract IActionResult CreateUsersWithListInput([FromBody]List<User> user);

        /// <summary>
        /// Delete user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="username">The name that needs to be deleted</param>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        [HttpDelete]
        [Route("/v2/user/{username}")]
        [Authorize(Policy = "api_key")]
        [ValidateModelState]
        public abstract IActionResult DeleteUser([FromRoute (Name = "username")][Required]string username);

        /// <summary>
        /// Get user by user name
        /// </summary>
        /// <param name="username">The name that needs to be fetched. Use user1 for testing.</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        [HttpGet]
        [Route("/v2/user/{username}")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(User))]
        public abstract IActionResult GetUserByName([FromRoute (Name = "username")][Required]string username);

        /// <summary>
        /// Logs user into the system
        /// </summary>
        /// <param name="username">The user name for login</param>
        /// <param name="password">The password for login in clear text</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username/password supplied</response>
        [HttpGet]
        [Route("/v2/user/login")]
        [ValidateModelState]
        [ProducesResponseType(statusCode: 200, type: typeof(string))]
        public abstract IActionResult LoginUser([FromQuery (Name = "username")][Required()][RegularExpression("^[a-zA-Z0-9]+[a-zA-Z0-9\\.\\-_]*[a-zA-Z0-9]+$")]string username, [FromQuery (Name = "password")][Required()]string password);

        /// <summary>
        /// Logs out current logged in user session
        /// </summary>
        /// <response code="0">successful operation</response>
        [HttpGet]
        [Route("/v2/user/logout")]
        [Authorize(Policy = "api_key")]
        [ValidateModelState]
        public abstract IActionResult LogoutUser();

        /// <summary>
        /// Updated user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="username">name that need to be deleted</param>
        /// <param name="user">Updated user object</param>
        /// <response code="400">Invalid user supplied</response>
        /// <response code="404">User not found</response>
        [HttpPut]
        [Route("/v2/user/{username}")]
        [Authorize(Policy = "api_key")]
        [Consumes("application/json")]
        [ValidateModelState]
        public abstract IActionResult UpdateUser([FromRoute (Name = "username")][Required]string username, [FromBody]User user);
    }
}
